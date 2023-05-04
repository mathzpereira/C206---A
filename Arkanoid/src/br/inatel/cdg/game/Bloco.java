package br.inatel.cdg.game;

public class Bloco {
    public static int numBlocos = 0;
    public static int blocosCriados;

    public Bloco() {
        numBlocos++;
    }

    public void destruir(){
        numBlocos--;
    }
    public static int getNumBlocos() {
        return numBlocos;
    }
}
