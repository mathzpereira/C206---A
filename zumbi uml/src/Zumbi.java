public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        System.out.println("O zumbi "+nome+" tem "+vida+" de vida");
        return 0;
    }
    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida>=quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else {
            System.out.println("Não é possível transferir esta quantidade de vida");
            return false;
        }
    }
}
