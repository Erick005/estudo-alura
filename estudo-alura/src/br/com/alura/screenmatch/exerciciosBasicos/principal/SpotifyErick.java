package br.com.alura.screenmatch.exerciciosBasicos.principal;

import br.com.alura.screenmatch.exerciciosBasicos.modelo.MinhasPreferidas;
import br.com.alura.screenmatch.exerciciosBasicos.modelo.Podcast;

public class SpotifyErick {
    public static void main(String[] args) {
        Musica minhasMusicas = new Musica();
        minhasMusicas.setTitulo("Eis Que Esou à Porta");
        minhasMusicas.setAlbum("Único - acústico");
        minhasMusicas.setArtista("Fernandinho");
        minhasMusicas.setGenero("Gospel");

        for (int i = 0; i < 15; i++) {
            minhasMusicas.reproduzir();
        }

        for (int i = 0; i < 15; i++) {
            minhasMusicas.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Cuidado ao se apegar em bens materiais");
        meuPodcast.setApresentador("Poderosíssimo ninja");
        meuPodcast.setDescricao("Não deixe que os bens materiais controlem a sua vida.");

        for (int i = 0; i < 15; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 15; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas minhaPreferida = new MinhasPreferidas();
        minhaPreferida.inclui(minhasMusicas);
        minhaPreferida.inclui(meuPodcast);
    }
}
