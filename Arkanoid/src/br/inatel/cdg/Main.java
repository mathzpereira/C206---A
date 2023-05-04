package br.inatel.cdg;

import br.inatel.cdg.Conversor;
import br.inatel.cdg.game.Bloco;
import br.inatel.cdg.player.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador j = new Jogador();

        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();

        Bloco.blocosCriados = Bloco.numBlocos;

        j.destruirBloco(b1);
        j.destruirBloco(b2);

        System.out.println("Blocos criados: " + Bloco.blocosCriados);
        System.out.println("Blocos destruídos: " + j.getBlocosDestruidos());
        System.out.println("Pontuação final: " + j.getBlocosDestruidos() * 5);
        System.out.println("Moedas ganhas: " + Conversor.converter(j.getBlocosDestruidos() * 5));
    }
}