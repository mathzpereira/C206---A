public class Main {
    public static void main(String[] args) {

        Zumbi hulk = new Zumbi();
        hulk.vida = 100;
        hulk.nome = "Hulk";

        Zumbi carabobo = new Zumbi();
        carabobo.vida = 100;
        carabobo.nome = "Carabobo";

        carabobo.transfereVida(hulk,100);

        hulk.mostraVida();
        carabobo.mostraVida();
    }
}