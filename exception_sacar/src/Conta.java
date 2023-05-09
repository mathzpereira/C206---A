public class Conta {
    double saldo;
    double limite;
    Cliente cliente;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException{
        if(quantia < (saldo+limite))
            saldo -= quantia;
        else
            throw new SaldoInsuficienteException("Saldo insuficiente!");
    }
}
