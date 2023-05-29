package org.example;

public abstract class RedeSocial { // Classe abstrata para servir como base da herança

    // Atributos conhecidos pelas classes filhas
    protected String senha;
    protected int numAmigos;

    // Construtor
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    // Métodos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("Publicação curtida");
    }
}
