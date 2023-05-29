package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes e atribuindo as Redes Sociais ao array
        RedeSocial[] redes = new RedeSocial[5];
        Instagram instagram = new Instagram("123456", 156);
        Facebook facebook = new Facebook("123456", 90);
        redes[0] = facebook;
        redes[1] = instagram;
        Usuario user = new Usuario(redes);

        // Utilizando setter para atributos privados
        user.setNome("Mathz");
        user.setEmail("mathlimapereira@gmail.com");

        // Mostrando informações
        System.out.println("Nome do Usuário: " + user.getNome());
        System.out.println("E-mail: " + user.getEmail());
        System.out.println();

        // Percorrendo o array para utilizar os métodos dependendo do tipo de subclasse
        for (int i = 0; i < user.getRedesSociais().length; i++) {
            if (user.getRedesSociais()[i] != null) {
                try { // Verificando posssíveis exceptions
                    if (user.getRedesSociais()[i] instanceof Facebook) {
                        Facebook f = (Facebook) user.getRedesSociais()[i];

                        f.compartilhar();
                        f.curtirPublicacao();
                        f.fazStreaming();

                    } else if (user.getRedesSociais()[i] instanceof Twitter) {
                        Twitter t = (Twitter) user.getRedesSociais()[i];

                        t.postarComentario();
                        t.postarFoto();
                        t.postarVideo();

                    } else if (user.getRedesSociais()[i] instanceof Instagram) {
                        Instagram ig = (Instagram) user.getRedesSociais()[i];

                        ig.postarComentario();
                        ig.postarFoto();
                        ig.postarVideo();

                    } else if (user.getRedesSociais()[i] instanceof GooglePlus) {
                        GooglePlus g = (GooglePlus) user.getRedesSociais()[i];

                        g.compartilhar();
                        g.postarComentario();
                        g.fazStreaming();
                        g.postarFoto();
                        g.curtirPublicacao();
                        g.postarVideo();

                    }

                } catch (Exception e) {
                    System.out.println("Erro encontrado: " + e.getMessage());
                }
                System.out.println();

            }
        }
    }
}