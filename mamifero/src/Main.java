public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Jorge",100);
        Mamifero lontra = new Lontra("Fábio",50);
        Mamifero boi = new Boi("Diniz", 300);

        boi.emitirSom();
        cachorro.emitirSom();
        lontra.emitirSom();
        lontra.mostraInfo();
        cachorro.mostraInfo();
    }
}