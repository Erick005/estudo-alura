package br.com.alura.screenmatch.locadoraexercicios.principal;

import br.com.alura.screenmatch.locadoraexercicios.modelo.Filme;
import br.com.alura.screenmatch.locadoraexercicios.modelo.Pessoa;
import br.com.alura.screenmatch.locadoraexercicios.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avatar", 2022,200, "Erick");
        meuFilme.avalia(10);

        Filme outroFilme = new Filme("RoboCopy", 2002, 170, "Erick");
        outroFilme.avalia(8);

        ArrayList<Filme> listFilm = new ArrayList<>();
        listFilm.add(meuFilme);
        listFilm.add(outroFilme);
        System.out.println("Quantidade de filmes: " + listFilm.toString().concat(" Esse é o novo formato do toString, incrível."));
        System.out.println("Filme inicial: " + listFilm.get(0).toString());

        Serie minhaSeie = new Serie("Doutor House", 2012,90, 12);
        minhaSeie.avalia(10);

        Serie outraSerie = new Serie("Reforma de carro", 2022, 70, 15);
        outraSerie.avalia(8);

        ArrayList<Serie> listSerie = new ArrayList<>();
        listSerie.add(minhaSeie);
        listSerie.add(outraSerie);
        System.out.println("Total de serie: " + listSerie.size());
        System.out.println("Minha serie favorita: " + listSerie.get(0));
        System.out.println("Todas as series: " + listSerie);


        Pessoa pessoa1 = new Pessoa("Ana" , 23);
        Pessoa pessoa2 = new Pessoa("Gabriela", 24);
        Pessoa pessoa3 = new Pessoa("Erick", 25);

        ArrayList<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(pessoa1);
        listPessoas.add(pessoa2);
        listPessoas.add(pessoa3);
        System.out.println("Total de pessoas: " + listPessoas.size());
        System.out.println("Pessoa numero 1: " + listPessoas.get(0));
        System.out.println("Todas as pessoas: " + listPessoas);


    }
}
