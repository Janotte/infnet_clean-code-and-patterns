package br.com.infnet.projetofinal.empresaacme.modelos;

import java.util.HashMap;
import java.util.Map;

public class Vendedor {

    private DadosPessoais dadosPessoais;
    private Endereco endereco;
    private Long quantidadeDeVendas;
    private boolean platinum;
    private Map<Integer, String> cursos = new HashMap<>();

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public void setPlatinum(boolean platinum) {
        this.platinum = platinum;
    }

    public boolean isPlatinum(Boolean metaBatida){
        setPlatinum(false);
        if(quantidadeDeVendas > 35 && cursos.size() > 3 && metaBatida){
            setPlatinum(true);
        }
        return this.platinum;
    }

    public Map<Integer, String> getCursos() {
        return cursos;
    }

    public void setCursos(Map<Integer, String> cursos) {
        this.cursos = cursos;
    }
}