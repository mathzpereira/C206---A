public class Main {
    public static void main(String[] args) {
        // Instanciando as classes
        Banda banda = new Banda();
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Empresario empresario = new Empresario();
        Membro membro1 = new Membro();
        Membro membro2 = new Membro();

        // Definindo as variáveis das classes
        banda.nome = "Banda das Estações";
        banda.genero = "Eclético";
        musica1.nome = "O som do verão";
        musica1.duracao = 2;
        musica2.nome = "O som do inverno";
        musica2.duracao = 3;
        membro1.nome = "Hulk";
        membro1.funcao = "Cantor";
        membro2.nome = "Chris";
        membro2.funcao = "Bateirista";
        empresario.nome = "Allan Jesus";
        empresario.cnpj = 123456789;
        banda.empresario = empresario;

        // Utilizando os métodos
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.mostraInfo();

    }
}