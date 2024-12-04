package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private int c = 32;

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double convertidoParaFahrenheit = (celsius * 1.8) + c;
        System.out.println("Valor de celsius para fahrenheit: " + convertidoParaFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double convertidoParaCelsius = (fahrenheit - c) / 1.8;
        System.out.println("Valor de fahrenheit para celsius: " + convertidoParaCelsius);
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.celsiusParaFahrenheit(42.0);
        conversorTemperaturaPadrao.fahrenheitParaCelsius(107.7);
    }
}
