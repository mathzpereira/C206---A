import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de lanches: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Digite o número de lanches: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Digite o número de lanches: ");
        int lanche3 = entrada.nextInt();

        entrada.close();

        int soma = lanche1 + lanche2 + lanche3;
        double media = soma/3.0;

        System.out.println("A soma foi de "+soma);
        System.out.println("A media foi de "+String.format("%.2f",media));

    }
}