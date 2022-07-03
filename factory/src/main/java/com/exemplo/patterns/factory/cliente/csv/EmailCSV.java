package com.exemplo.patterns.factory.cliente.csv;

import com.exemplo.patterns.factory.biblioteca.comunicacao.GeraEmail;
import com.exemplo.patterns.factory.biblioteca.contato.Contatos;

public class EmailCSV extends GeraEmail {

    private String nomeDoArquivo;

    public EmailCSV(String nomeDoArquivo) { this.nomeDoArquivo = nomeDoArquivo; }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeDoArquivo);
    }
}
