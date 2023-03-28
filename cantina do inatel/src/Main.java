public class Main {
    public static void main(String[] args) {
        // Instanciando as classes
        Cantina cantina = new Cantina();
        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        // Definindo a variável "nome" das classes
        cantina.nome = "Cantina do Inatel";
        s1.nome = "Coxinha";
        s2.nome = "Cigarrete";
        s3.nome = "Pastel";

        // Utilizando os métodos
        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        cantina.mostraInfo();
    }
}