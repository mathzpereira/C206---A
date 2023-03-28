public class Cliente {
    // Características do Cliente
    String nome = "Hulk";
    long cpf = 123456789;
    Computador[] computadores = new Computador[10];

    // Método utilizado para calcular o valor total da compra do Cliente
    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null)
                total += computadores[i].preco;
        }

        return total;
    }
}
