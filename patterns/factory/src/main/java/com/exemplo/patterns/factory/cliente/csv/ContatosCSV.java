package com.exemplo.patterns.factory.cliente.csv;

import au.com.bytecode.opencsv.CSVReader;
import com.exemplo.patterns.factory.biblioteca.contato.Contato;
import com.exemplo.patterns.factory.biblioteca.contato.Contatos;

import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContatosCSV implements Contatos {

    private final String nomeDoArquivo;

    ContatosCSV(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public List<Contato> contatos() {

        List<Contato> contatosCSV = new ArrayList<>();

        try {
            URI uri = Objects.requireNonNull(this.getClass().getResource("/" + nomeDoArquivo)).toURI();
            File arquivoCSV = new File(uri);
            FileReader leitorDeArquivo = new FileReader(arquivoCSV);
            CSVReader csvReader = new CSVReader(leitorDeArquivo);
            String[] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                contatosCSV.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro de leitura do arquivo CSV", e);
        }

        return contatosCSV;
    }
}
