public class Main {
    public static void main(String[] args) {
        // criando instancias
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.atacar(z1, z2);
        System.out.println(z2.vida);
    }
}

