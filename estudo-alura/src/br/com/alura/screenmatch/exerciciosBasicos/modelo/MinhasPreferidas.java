package br.com.alura.screenmatch.exerciciosBasicos.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " Preferida por muitos");
        } else {
            System.out.println(audio.getTitulo() + " Alguns gostam");
        }
    }
}
