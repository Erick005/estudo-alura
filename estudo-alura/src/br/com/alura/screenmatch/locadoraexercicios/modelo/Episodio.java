package br.com.alura.screenmatch.locadoraexercicios.modelo;

public class Episodio extends Titulo implements Classificacao {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacao;

    public Episodio(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, duracaoEmMinutos);
    }

    public int getClassificacao() {
        if (totalVisualizacao >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
