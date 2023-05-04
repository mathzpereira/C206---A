public class Comprador {
    String nome;
    double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
    }
}
