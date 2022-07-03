package com.exemplo.patterns.factory.cliente.xml;

import com.exemplo.patterns.factory.biblioteca.comunicacao.GeraEmail;
import com.exemplo.patterns.factory.biblioteca.contato.Contatos;

public class EmailXML extends GeraEmail {

    private String nomeDoArquivo;

    public EmailXML(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeDoArquivo);
    }

}
