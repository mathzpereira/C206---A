import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Nave do Hulk",100,"Normal");
        Asteroide ast = new Asteroide("Pedra","Grande");

        nave.atirar(ast);
    }
}