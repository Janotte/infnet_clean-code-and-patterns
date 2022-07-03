package br.com.infnet.projetofinal.empresaacme.modelos;

import java.util.Date;

public class Engenheiro {

    private DadosPessoais dadosPessoais;
    private Endereco endereco;
    private String numeroConselho;
    private QualificacoesEngenheiro qualificacoes;

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

    public Double calculaBonusEngenheiro() {
        return dadosPessoais.getTempoDeServicoEmAnos() * 3.7;
    }

    public String getNumeroConselho() {
        return getNumeroConselho() + new Date().getYear();
    }

    public void setNumeroConselho(String numeroConselho) { this.numeroConselho = numeroConselho; }

    public QualificacoesEngenheiro getQualificacoes() {
        return qualificacoes;
    }

    public void setQualificacoes(QualificacoesEngenheiro qualificacoes) {
        this.qualificacoes = qualificacoes;
    }
}