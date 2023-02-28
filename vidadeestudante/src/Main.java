import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

        int npa = entrada.nextInt();
        if(npa >= 60)
            System.out.println("Aprovado");
        else
            System.out.println("Ficou de NP3");
            int np3 = entrada.nextInt();
            int nfa = (np3 + npa)/2;
            if(nfa >= 50)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
    }
}