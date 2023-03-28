public class Main {
    public static void main(String[] args) {
        Personagem hulk = new Personagem();
        Arma esmagadora = new Arma();

        hulk.nome = "Hulk";
        hulk.hp = 999999999;
        hulk.arma = esmagadora;
        esmagadora.nome= "A Esmagadora";
        esmagadora.descricao = "Hulk esmaga";
        esmagadora.resistencia = 10;
        esmagadora.poder = 999999;

        System.out.println("Vida do personagem: " + hulk.hp);
        hulk.tomarDano();
        System.out.println("Vida do personagem: " + hulk.hp);

        System.out.println("Informações da arma: ");
        esmagadora.mostraInfoArma();
        hulk.usarArma();
        esmagadora.mostraInfoArma();

    }
}