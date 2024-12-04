package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class Musica {

    private String titulo;
    private String artista;
    private String anoLancamento;
    private double avaliacao, numAvaliacoes;

    public void pegaAvaliacoes(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
