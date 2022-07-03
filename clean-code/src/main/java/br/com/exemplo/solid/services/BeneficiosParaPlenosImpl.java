package br.com.exemplo.solid.services;

import java.math.BigDecimal;

public class BeneficiosParaPlenosImpl implements AuxilioAlimentacao, AuxilioTransporte{


    @Override
    public BigDecimal valorDoAuxilioAlimentacao() {
        return new BigDecimal(600.00);
    }


    @Override
    public BigDecimal valorDoAuxilioTransporte() {
        return new BigDecimal( 400.00);
    }
}
