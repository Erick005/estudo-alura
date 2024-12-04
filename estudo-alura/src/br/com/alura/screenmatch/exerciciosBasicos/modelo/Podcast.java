package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class Podcast extends Audio {
    private String apresentador;
    private String Descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String host) {
        this.apresentador = host;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalDeReproducoes() > 9) {
            return 10;
        } else {
            return 8;
        }
    }
}
