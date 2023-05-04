public class Main {
    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café",200,"Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella",100,"Nutella");
        BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite",50,"Doce de Leite");
        Comprador comprador = new Comprador("João",200);

        comprador.efetuarCompra(bwNutella);
    }
}