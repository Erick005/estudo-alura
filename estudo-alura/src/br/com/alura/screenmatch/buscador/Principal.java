package br.com.alura.screenmatch.buscador;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var cep = scanner.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeEndereco geradorDeEndereco = new GeradorDeEndereco();
            geradorDeEndereco.gerarEndereco(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
