public class Main {
    public static void main(String[] args) {
        // Instanciando Pilotos e Karts (motor instancia automaticamente devido à composição)
        Piloto hulk = new Piloto();
        Piloto daronco = new Piloto();
        Kart k1 = new Kart();
        Kart k2 = new Kart();

        // Setando nome e piloto dos karts
        k1.nome = "Hulkmóvel";
        k2.nome = "Daroncomóvel";
        k1.piloto = hulk;
        k2.piloto = daronco;

        // Setando nome e dizendo se os pilotos são ou não vilões
        hulk.nome = "Hulk";
        daronco.nome = "Daronco";
        hulk.vilao = false;
        daronco.vilao = true;

        // Setando cilindradas e velocidade dos motores (acessando por composição)
        k1.motor.cilindradas = "150";
        k2.motor.cilindradas = "50";
        k1.motor.velocidadeMaxima = 150;
        k2.motor.velocidadeMaxima = 50;

        // Ações das Classes (métodos)
        k1.pular();
        k1.fazerDrift();
        k1.soltarTurbo();
        hulk.soltaSuperPoder();
        k1.motor.mostraInfo();
        k2.motor.mostraInfo();

    }
}
