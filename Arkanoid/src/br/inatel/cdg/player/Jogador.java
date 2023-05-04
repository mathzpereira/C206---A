package br.inatel.cdg.player;
import br.inatel.cdg.game.Bloco;

public class Jogador {

    private int blocosDestruidos = 0;

    public void destruirBloco(Bloco bloco){
        blocosDestruidos++;
        bloco.destruir();
    }

    public int getBlocosDestruidos() {
        return blocosDestruidos;
    }
}
