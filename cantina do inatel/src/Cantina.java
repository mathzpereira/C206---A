public class Cantina {
    // Definindo as variáveis (incluindo o array)
    String nome;
    Salgado salgados[] = new Salgado[3];

    // Método para adicionar um novo salgado no array
    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) { // Percorre o array até o final (array.length)
            if (salgados[i] == null) { // Verifica se a posição do array já não está preenchida
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    // Método para mostrar os salgados da cantina (percorrer o array)
    public void mostraInfo(){
            for(int i=0; i< salgados.length; i++){
                if(salgados[i] != null)
                System.out.println(salgados[i].nome);
            }
        }
}
