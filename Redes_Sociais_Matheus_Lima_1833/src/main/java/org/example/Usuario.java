package org.example;

public class Usuario {
    // Atributos privados do Usuario
    private String nome;
    private String email;
    private RedeSocial[] redesSociais = new RedeSocial[5];

    // Construtor
    public Usuario(RedeSocial[] redesSociais) {
        this.redesSociais = redesSociais;
    }

    // Getters e setters para atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedesSociais() {
        return redesSociais;
    }

}
