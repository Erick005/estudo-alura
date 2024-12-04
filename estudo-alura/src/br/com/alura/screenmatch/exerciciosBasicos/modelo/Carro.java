package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class Carro {

    private String modelo;
    private int ano = 2024;
    private String cor;

    public int calcularAnoUso(int anoDoCarro) {
        ano = ano - anoDoCarro;
        return ano;
    }

    public void exibeFixaTecnica() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Seu carro tem " + ano + " Anos de uso.");
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
