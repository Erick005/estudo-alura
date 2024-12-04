package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class Calculadora {

    private int somar;
    private int dividir;
    private int multiplicar;
    private int subtracao;

    public void setSomar(int somar) {
        this.somar = somar;
    }

    public void setDividir(int dividir) {
        this.dividir = dividir;
    }

    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }

    public void setSubtracao(int subtracao) {
        this.subtracao = subtracao;
    }

    public int getSomar() {
        return somar;
    }

    public int getDividir() {
        return dividir;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public int getSubtracao() {
        return subtracao;
    }

    public void retornaSoma(int somarValor) {
        somar = somarValor + 2;
        System.out.println("Valor duplicado: " + somar);
    }

    public void retornaDividir(int dividirValor) {
        dividir = dividirValor / 2;
        System.out.println("Valor duplicado: " + dividir);
    }

    public void retornaMultiplicar(int multiplicarValor) {
        multiplicar = multiplicarValor * 2;
        System.out.println("Valor duplicado: " + multiplicar);
    }

    public void retornaSubtracao(int subtrairValor) {
        subtracao = subtrairValor - 2;
        System.out.println("Valor duplicado: " + subtracao);
    }
}
