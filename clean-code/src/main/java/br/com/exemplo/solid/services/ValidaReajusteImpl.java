package br.com.exemplo.solid.services;

import br.com.exemplo.solid.models.Funcionario;
import br.com.exemplo.solid.models.Setor;

import java.math.BigDecimal;

public class ValidaReajusteImpl implements ValidaReajuste {

    private static final BigDecimal CEM = new BigDecimal(100);

    public void calcularReajuste(Funcionario funcionario, BigDecimal percentualDeReajuste) {
        if (funcionario.getDadosDoFuncionario().getSetor().equals(Setor.DESENVOLVIMENTO)) {
            funcionario.reajustarSalario(
                    funcionario.getDadosDoFuncionario().getSalario().multiply(percentualDeReajuste).divide(CEM));
        }

        if (funcionario.getDadosDoFuncionario().getSetor().equals(Setor.DEVOPS)) {
            BigDecimal reajusteAdicional = (new BigDecimal(5.00));
            funcionario.reajustarSalario(
                    funcionario.getDadosDoFuncionario().getSalario().multiply((percentualDeReajuste).add(reajusteAdicional)).divide(CEM));
        }

        if (funcionario.getDadosDoFuncionario().getSetor().equals(Setor.BANCO_DE_DADOS)) {
            BigDecimal reajusteAdicional = (new BigDecimal(7.00));
            funcionario.reajustarSalario(
                    funcionario.getDadosDoFuncionario().getSalario().multiply((percentualDeReajuste).add(reajusteAdicional)).divide(CEM));
        }
    }

}
