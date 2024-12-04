package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.Musica;

public class ImprimeMusica {

    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Melancolia");
        musica.setArtista("Erick");
        musica.setAnoLancamento("2024");

        musica.pegaAvaliacoes(8.0);
        musica.pegaAvaliacoes(9.0);
        musica.pegaAvaliacoes(8.0);

        System.out.println(musica.mediaAvaliacoes());

    }
}
