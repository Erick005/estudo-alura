package br.com.alura.screenmatch.locadoraexercicios.principal;

import br.com.alura.screenmatch.locadoraexercicios.exception.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.locadoraexercicios.modelo.Titulo;
import br.com.alura.screenmatch.locadoraexercicios.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalBuscarFilmes {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner perguntaFilme = new Scanner(System.in);
        String recebeRespostaFilme = "";
        List<Titulo> tituloList = new ArrayList<>();
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!recebeRespostaFilme.equalsIgnoreCase("sair")) {

            System.out.println("Qual é o seu filme favorito: ");
            recebeRespostaFilme = perguntaFilme.nextLine();

            if (recebeRespostaFilme.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + recebeRespostaFilme.replace(" ", "+") + "&apikey=6f83d88e";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo meuTitulo = new Titulo(tituloOmdb);
                tituloList.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
            }
        }

        FileWriter fileWriter = new FileWriter("filmes.json");
        fileWriter.write(gson.toJson(tituloList));
        fileWriter.close();

        System.out.println(tituloList);
        System.out.println("Finalizou o programa");

    }
}
