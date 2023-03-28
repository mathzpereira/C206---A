public class Kart {
    // Criando variáveis
    String nome;
    Piloto piloto;
    Motor motor;

    // Construtor para composição
    public Kart() {
        motor = new Motor();
    }

    // Criando métodos
    public void pular(){
        System.out.println("Pulando!");
    }
    public void soltarTurbo()
    {
        System.out.println("Ativando o turbo!");
    }
    public void fazerDrift(){
        System.out.println("Olha o DRIFT!");
    }
}
