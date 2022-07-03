package br.com.exemplo.solid.services;

import br.com.exemplo.solid.models.Funcionario;

import java.math.BigDecimal;

public interface ValidaReajuste {

    void calcularReajuste(Funcionario funcionario, BigDecimal percentualDeReajuste);

}
