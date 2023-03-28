import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int campoMinado[][] = new int[2][2]; // Cria matriz 2x2
        int bomba = 99;
        // Gera um número aleatório entre 0 e 1
        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        int posx;
        int posy;

        public void colocarBomba (int x,int y){
            for (int i = 0; i < campoMinado.length; i++) {
                for (int j = 0; j < campoMinado[i].length; j++) {
                    campoMinado[x][y] = bomba;
                }
            }
        }
        colocarBomba(x,y);
        while (posx != x && posy != y) {
            // Para ler do teclado a posição digitada
            System.out.println("Digite as posições (x e y) que quer fazer a jogada");
            Scanner in = new Scanner(System.in);
            posx = in.nextInt();
            posy = in.nextInt();
            System.out.println("Que sorte!");
        }

        System.out.println("Perdeu");
    }
}