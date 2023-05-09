import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /*Cliente c1 = new Cliente("Hulk");
        Cliente c2 = new Cliente("Igor Gomes");
        Cliente c3 = null;

        Conta conta1 = new Conta(100,200,c1);
        Conta conta2 = new Conta(100,200,c2);
        Conta conta3 = new Conta(100,200,c3);

        HashSet <Cliente> hashSet = new HashSet<Cliente>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);

        hashSet.forEach(cliente -> {
            try {
                cliente.mostraInfo();
            } catch (NullPointerException e){
                System.out.println("Erro: " + e);
            }
        });*/
        Conta conta = new Conta(200,100);

        try {
            conta.sacar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}