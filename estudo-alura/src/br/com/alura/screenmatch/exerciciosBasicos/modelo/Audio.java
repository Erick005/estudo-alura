package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class Audio {
    private String titulo;
    private double totalDeReproducoes;
    private double curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public double getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        curtidas++;
        System.out.println("Você curtiu, o total de curtidas são: " + curtidas);
    }

    public void reproduzir() {
        totalDeReproducoes++;
        System.out.println("Você reproduziu o audio");
    }
}
