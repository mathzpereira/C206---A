import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o número de alunos da sala (10, 20 ou 30): ");
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        // análise dos dados e saída
        switch (num) {
            case 10:
                System.out.println("A sala utilizada deve ser a I-16");
                break;
            case 20:
                System.out.println("A sala utilizada deve ser a I-16");
                break;
            case 30:
                System.out.println("A sala utilizada deve ser a I-22");
            default:
                System.out.println("Número de alunos inválido");
        }

        // fechando o scanner
        entrada.close();
    }
}
