package com.exemplo.patterns.factory.cliente.xml;

import com.exemplo.patterns.factory.biblioteca.contato.Contato;
import com.exemplo.patterns.factory.biblioteca.contato.Contatos;
import com.thoughtworks.xstream.XStream;

import java.net.URL;
import java.util.List;

public class ContatosXML implements Contatos {

    private String nomeDoArquivo;

    public ContatosXML(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Contato> contatos() {
        XStream xstream = new XStream();
        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);
        URL arquivo = this.getClass().getResource("/" + nomeDoArquivo);

        return (List<Contato>) xstream.fromXML(arquivo);
    }
}
