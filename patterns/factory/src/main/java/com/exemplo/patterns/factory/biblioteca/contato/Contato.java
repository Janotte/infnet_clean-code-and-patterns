package com.exemplo.patterns.factory.biblioteca.contato;

public class Contato {

    private final String nome;
    private final String email;

    public Contato(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
