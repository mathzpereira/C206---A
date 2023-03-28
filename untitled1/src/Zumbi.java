public class Zumbi {
    String nome;
    double vida = 20;
    int dano = 10;

    public static void atacar(Zumbi z1, Zumbi z2) {
        double novaVida = z2.vida - z1.dano;
        z2.vida = novaVida;
    }
}
