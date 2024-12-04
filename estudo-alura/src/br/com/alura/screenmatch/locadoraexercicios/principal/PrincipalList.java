package br.com.alura.screenmatch.locadoraexercicios.principal;

import br.com.alura.screenmatch.locadoraexercicios.modelo.Filme;
import br.com.alura.screenmatch.locadoraexercicios.modelo.Serie;
import br.com.alura.screenmatch.locadoraexercicios.modelo.Titulo;

import java.util.*;

public class PrincipalList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avatar", 2022,200, "Erick");
        meuFilme.avalia(10);

        Filme outroFilme = new Filme("RoboCopy", 2010, 170, "Erick");
        outroFilme.avalia(10);

        Serie minhaSeie = new Serie("Doutor House", 2012,90, 12);
        minhaSeie.avalia(10);

        Serie outraSerie = new Serie("Reforma de carro", 2008, 70, 15);
        outraSerie.avalia(10);

        ArrayList<Titulo> incluiFS = new ArrayList<>();
        incluiFS.add(meuFilme);
        incluiFS.add(outroFilme);
        incluiFS.add(minhaSeie);
        incluiFS.add(outraSerie);
        for (Titulo titulo : incluiFS) {
            if (titulo instanceof Filme filme) {
                System.out.println("Lista de filmes: " + filme.getNome() + " - Classificação: " + filme.getClassificacao());
            } else if (titulo instanceof Serie serie){
                System.out.println("Lista de Series: " + serie.getNome() + " - Classificação: " + serie.getClassificacao());
            }
        }

        Collections.sort(incluiFS);
        System.out.println("Ordenação por nome");
        System.out.println(incluiFS);

        System.out.println("Ordenado por ano");
//        Outra forma é usar o lambda (Titulo -> Titulo.getAnoDeLancamento())
        incluiFS.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(incluiFS);

//        ---------------------------------

        List<String> nomePessoas = new ArrayList<>();
        nomePessoas.add("Erick");
        nomePessoas.add("Ana");
        nomePessoas.add("monique");
        nomePessoas.add("Gabriel");
        Collections.sort(nomePessoas);
        System.out.println(nomePessoas);

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(5);
        listaNumeros.add(7);
        listaNumeros.add(2);
        listaNumeros.add(9);
        System.out.println(listaNumeros);
        listaNumeros.sort(Comparator.naturalOrder());
        System.out.println("Com naturalOrder(): " + listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println("Com Collections: " + listaNumeros);
    }
}
