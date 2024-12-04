package br.com.alura.screenmatch.locadoraexercicios.modelo;

public class Serie extends Titulo implements Classificacao{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTempo;
    private int minutosPorEpisodios;

    public Serie(String nome, int anoDeLancamento, int duracaoEmMinutos, int temporadas) {
        super(nome, anoDeLancamento, duracaoEmMinutos);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTempo * minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " - Ano: " + this.getAnoDeLancamento();
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
