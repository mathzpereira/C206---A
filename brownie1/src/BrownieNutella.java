
public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando nutella no brownie " + nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de nutela aheaeaeaea");
    }
}
