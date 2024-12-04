package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.Carro;

public class ImprimeCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setModelo("chevrolet");
        carro.setCor("Branco");
        carro.calcularAnoUso(2018);

        carro.exibeFixaTecnica();
    }
}
