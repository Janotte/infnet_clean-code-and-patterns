package br.com.exemplo.solid.models;

import java.math.BigDecimal;

public class Funcionario {

    private DadosDoFuncionario dadosDoFuncionario;

    public Funcionario() { }

    public DadosDoFuncionario getDadosDoFuncionario() {
        return dadosDoFuncionario;
    }

    public void setDadosDoFuncionario(DadosDoFuncionario dadosDoFuncionario) {
        this.dadosDoFuncionario = dadosDoFuncionario;
    }

    public void reajustarSalario(BigDecimal reajuste) { dadosDoFuncionario.setSalario(dadosDoFuncionario.getSalario().add(reajuste)); }

    public void adicionarBeneficio(BigDecimal beneficio) { dadosDoFuncionario.setSalario(dadosDoFuncionario.getSalario().add(beneficio)); }

}
