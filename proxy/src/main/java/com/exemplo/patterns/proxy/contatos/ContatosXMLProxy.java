package com.exemplo.patterns.proxy.contatos;

import com.exemplo.patterns.proxy.repositorio.Contatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContatosXMLProxy implements Contatos {

    private ContatosXML contatosXML;
    private List<String> nomesDeArquivos;

    public ContatosXMLProxy(String... nomesDeArquivos) {
        this.nomesDeArquivos = new ArrayList<>(Arrays.asList(nomesDeArquivos));
    }

    @Override
    public String buscarPorEmail(String email) {
        String nome = null;
        Random random = new Random();

        int numeroDeArquivos = nomesDeArquivos.size();
        for(int i = 0; i < numeroDeArquivos; i++) {
            int indiceDeBusca = random.nextInt(nomesDeArquivos.size());

            String nomeDoArquivo = nomesDeArquivos.remove(indiceDeBusca);
            this.contatosXML = new ContatosXML(nomeDoArquivo);
            nome = this.contatosXML.buscarPorEmail(email);
            if (nome != null) break;
        }
        return nome;
    }
}
