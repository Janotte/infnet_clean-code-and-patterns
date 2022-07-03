package br.com.exemplo.solid.services;

import br.com.exemplo.solid.models.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioService {

    private List<ValidaReajuste> validacoes;

    private List<ValidaBeneficio> beneficios;

    public FuncionarioService(List<ValidaReajuste> validacoes, List<ValidaBeneficio> beneficios) {
        this.validacoes = validacoes;
        this.beneficios = beneficios;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal percentualDeReajuste) {
        validacoes.forEach(validacao -> validacao.calcularReajuste(funcionario, percentualDeReajuste));
    }

    public  void calcularBeneficios(Funcionario funcionario) {

        beneficios.forEach((beneficio -> beneficio.calcularBeneficio(funcionario)));
    }

}
