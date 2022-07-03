package com.exemplo.patterns.proxy.contatos;

import com.exemplo.patterns.proxy.modelos.Contato;
import com.exemplo.patterns.proxy.repositorio.Contatos;
import com.thoughtworks.xstream.XStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContatosXML implements Contatos {

    private Map<String, String> contatosEmCache = new HashMap<>();

    @SuppressWarnings("unchecked")
    public ContatosXML(String... nomesDeArquivos) {
        XStream xStream = new XStream();
        xStream.alias("contatos", List.class);
        xStream.alias("contato", Contato.class);

        for (String nomeDoArquivo: nomesDeArquivos) {
            System.out.println("Carregando origem... " + nomeDoArquivo);
            List<Contato> contatosCarregados = (List<Contato>) xStream.fromXML(this.getClass().getResource("/" + nomeDoArquivo));
            for (Contato contato : contatosCarregados) {
                contatosEmCache.put(contato.getEmail(), contato.getNome());
            }
        }
    }

    @Override
    public String buscarPorEmail(String email) {
        return contatosEmCache.get(email);
    }
}
