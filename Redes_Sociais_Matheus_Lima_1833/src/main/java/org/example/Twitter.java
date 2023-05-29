package org.example;

public class Twitter extends RedeSocial implements Compartilhamento{ // Herança e Implementação de Interface

    // Construtor
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Métodos com override
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Twitter");
    }
}
