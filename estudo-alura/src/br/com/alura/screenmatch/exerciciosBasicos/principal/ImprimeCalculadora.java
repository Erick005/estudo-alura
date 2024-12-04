package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.Calculadora;

public class ImprimeCalculadora {

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        calcular.setSomar(3);
        calcular.retornaSoma(calcular.getSomar());

        calcular.setDividir(4);
        calcular.retornaDividir(calcular.getDividir());

        calcular.setMultiplicar(4);
        calcular.retornaMultiplicar(calcular.getMultiplicar());

        calcular.setSubtracao(4);
        calcular.retornaSubtracao(calcular.getSubtracao());

    }
}
