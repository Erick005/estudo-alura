package br.com.alura.screenmatch.locadoraexercicios.modelo;

public class Filme extends Titulo implements Classificacao{

    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos);
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
