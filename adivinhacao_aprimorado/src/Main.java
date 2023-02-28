import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10)+1; //gera um numero aleatorio entre 1 e 10
        Scanner entrada = new Scanner(System.in);
        int num; // numero do palpite
        System.out.println("Adivinhe o número gerado de 1 a 10");
        for(int i=0;i<10;i++){
            num = entrada.nextInt();
            if(num==x)
                break;
            else
                System.out.print("Não era esse o número. Tente um número ");
            if(x>num)
                System.out.println("maior.");
            if(x<num)
                System.out.println("menor.");
        }
        System.out.println("Você acertou. Parabéns!");
    }
}
