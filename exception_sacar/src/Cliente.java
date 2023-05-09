public class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
    }
}
