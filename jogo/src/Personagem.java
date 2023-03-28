public class Personagem {
    String nome;
    int hp; // vida do personagem
    Arma arma; // agregação

    void usarArma(){
        arma.resistencia -= 2;
    }
    void tomarDano(){
        hp -= 5;
    }
}
