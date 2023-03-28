public class Banda {
    String nome;
    String genero;
    Musica musicas[] = new Musica[10];
    Empresario empresario;
    Membro membros[] = new Membro[10];

    public void mostraInfo(){
        System.out.println("--- INFORMAÇÕES DA BANDA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Músicas: ");
        for(int i=0; i<musicas.length; i++){
            if(musicas[i] != null) // Mostra a música se não for nula
            System.out.println(musicas[i].nome + " " + musicas[i].duracao + " minutos");
        }
        System.out.println("Membros: ");
        for(int i=0; i<membros.length; i++){
            if(musicas[i] != null)
            System.out.println(membros[i].nome);
        }
        System.out.println("Empresário: " + empresario.nome + " " + empresario.cnpj);
    }

    public void addMusicaNova(Musica musica){
        for (int i = 0; i < musicas.length; i++) { // Percorre o array até o final (array.length)
            if (musicas[i] == null) { // Verifica se a posição do array já não está preenchida
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < membros.length; i++) { // Percorre o array até o final (array.length)
            if (membros[i] == null) { // Verifica se a posição do array já não está preenchida
                membros[i] = membro;
                break;
            }
        }
    }

}
