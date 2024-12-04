package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterMoeda(double valorEmDolar) {
        double convertido = valorEmDolar * 5;
        System.out.println(String.format("O Valor de %.2f dolares, vai ficar %.2f reais : ", valorEmDolar, convertido));
    }

    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterMoeda(100.00);
    }
}
