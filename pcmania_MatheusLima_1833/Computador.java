public class Computador {
    // Características do Computador
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico[] hw = new HardwareBasico[3];
    MemoriaUSB mem;

    // Construtor utilizando composição para Sistema Operacional e Hardware
    public Computador(String marca, float preco, String nomeSO, int tipoSO, String nomeHW1, float capacidadeHW1, String nomeHW2, float capacidadeHW2, String nomeHW3, float capacidadeHW3) {
        this.marca = marca;
        this.preco = preco;
        this.so = new SistemaOperacional(nomeSO, tipoSO);
        this.hw[0] = new HardwareBasico(nomeHW1, capacidadeHW1);
        this.hw[1] = new HardwareBasico(nomeHW2, capacidadeHW2);
        this.hw[2] = new HardwareBasico(nomeHW3, capacidadeHW3);
    }

    // Método para mostrar todas as configs do Computador
    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Hardware: ");
        for (int i = 0; i < hw.length; i++) {
            if (hw[i] != null)
                System.out.println(hw[i].nome + " " + hw[i].capacidade);
        }
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + " bits)");
        System.out.println("Memória USB: " + mem.nome + " " + mem.capacidade + " GB");
    }

    // Método para atribuir uma memória USB a um Computador
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.mem = musb;
    }
}
