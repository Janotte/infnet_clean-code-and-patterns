package br.com.exemplo.solid.services;

import java.math.BigDecimal;

public class BeneficiosParaSeniorsImpl implements AuxilioAlimentacao {

    @Override
    public BigDecimal valorDoAuxilioAlimentacao() {
        return new BigDecimal(1000.00);
    }

}
