package br.com.alura.screenmatch.locadoraexercicios.calculos;

import br.com.alura.screenmatch.locadoraexercicios.modelo.Classificacao;

public class FiltroRecomendacao {
    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para assistir depois");
        }
    }
}
