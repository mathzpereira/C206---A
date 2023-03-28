import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes (utilizando composição)
        Cliente cliente = new Cliente();
        Computador c1 = new Computador("Positivo", 2300, "Linux Ubuntu", 32, "Pentium Core i3", 2200, "Memória RAM", 8, "HDD", 500);
        Computador c2 = new Computador("Acer", 5800, "Windows 8", 64, "Pentium Core i5", 3370, "Memória RAM", 16, "HDD", 1024);
        Computador c3 = new Computador("Vaio", 1800, "Windows 10", 64, "Pentium Core i7", 4500, "Memória RAM", 32, "HDD", 2048);
        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1);

        // Utilizando o método de adicionar dispositivo USB ao computador (agregação)
        c1.addMemoriaUSB(usb1);
        c2.addMemoriaUSB(usb2);
        c3.addMemoriaUSB(usb3);

        boolean flag = true; // Controle do loop do menu
        int op; // Opção do menu
        int cont = 0; // Contador para saber quantas vezes o menu está sendo executado
        Scanner in = new Scanner(System.in); // Inicializando o Scanner para interagir com o usuário

        while (flag) {
            if(cont == 0) {
                System.out.println("Bem-vindo à PCMania!");
                System.out.println("Temos 3 opções de computadores. Confira as especificações: ");
                System.out.println("PC 1:");
                c1.mostraPCConfigs();
                System.out.println("PC 2:");
                c2.mostraPCConfigs();
                System.out.println("PC 3:");
                c3.mostraPCConfigs();
            }
            cont++;
            System.out.print("Escolha uma opção (1, 2 ou 3): ");
            System.out.println("Caso queira encerrar a compra, digite 0.");
            op = in.nextInt();
            switch (op) {
                // Casos 1, 2 e 3 adicionam um elemento do tipo Computador ao array computadores dentro da classe Cliente
                // Caso 0 interrompe o loop e caso padrão pede para digitar um número válido
                case 1:
                    for(int i=0; i<cliente.computadores.length;i++){
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = c1;
                            break;
                        }
                    }
                    break;
                case 2:
                    for(int i=0; i<cliente.computadores.length;i++){
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = c2;
                            break;
                        }
                    }
                    break;
                case 3:
                    for(int i=0; i<cliente.computadores.length;i++){
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = c3;
                            break;
                        }
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        }

        System.out.println("Nome do Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra()); // Exibindo o valor da compra

        in.close(); // Fechando o Scanner
    }
}