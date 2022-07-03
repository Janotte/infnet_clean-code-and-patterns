package br.com.exemplo.solid.services;

import java.math.BigDecimal;

public class BeneficiosParaJuniorsImpl implements AuxilioAlimentacao, AuxilioEducacao, AuxilioTransporte{


    @Override
    public BigDecimal valorDoAuxilioAlimentacao() {
        return new BigDecimal(400.00);
    }

    @Override
    public BigDecimal valorDoAuxilioEducacao() {
        return new BigDecimal(600.00);
    }

    @Override
    public BigDecimal valorDoAuxilioTransporte() {
        return new BigDecimal( 400.00);
    }
}
