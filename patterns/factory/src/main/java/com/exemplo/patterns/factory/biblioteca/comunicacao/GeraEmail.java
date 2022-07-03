package com.exemplo.patterns.factory.biblioteca.comunicacao;

import com.exemplo.patterns.factory.biblioteca.contato.Contato;
import com.exemplo.patterns.factory.biblioteca.contato.Contatos;

import java.util.List;

public abstract class GeraEmail {

    protected  abstract  Contatos criarContatos();

    public boolean enviarEmail(String mensagem) {

        List<Contato> contatos = criarContatos().contatos();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Conectando o Servidor de Email...");
        System.out.println("Mensagem a ser enviada: " + mensagem  + "\n");

        for (Contato contato: contatos) {
            System.out.println("De:Design Patterns<contato@patterns.exemplo.com>");
            System.out.println(String.format("Para: %s<%s>", contato.getNome(), contato.getEmail()));
            System.out.println("Mensagem: " + mensagem + "\n");
        }
        System.out.println("------------------------------------------------------------------------");
        return true;

    }
}
