package com.exemplo.patterns.observer.repositorio;

import com.exemplo.patterns.observer.modelos.builder.LancamentoBuilder;
import com.exemplo.patterns.observer.modelos.Lancamento;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Lancamentos {

    public List<Lancamento> vencidos() {

        Lancamento lancamento1 = LancamentoBuilder.criarLancamento()
                .comCliente("Maria Borges", "maria@exemplo.com", "(47) 99999-9999")
                .comDescricao("NFE000111 Parcela 02 de 06")
                .comValor(new BigDecimal(390))
                .comDataVencimento(new Date())
                .construir();

        Lancamento lancamento2 = LancamentoBuilder.criarLancamento()
                .comCliente("Rita Quintino", "rita@exemplo.com", "(47) 99999-7000")
                .comDescricao("NFE000219 Parcela 01 de 03")
                .comValor(new BigDecimal(249))
                .comDataVencimento(new Date())
                .construir();

        Lancamento lancamento3 = LancamentoBuilder.criarLancamento()
                .comCliente("Evacir Barth", "evacir@exemplo.com", "(47) 99999-6000")
                .comDescricao("NFE000189 Parcela 01 de 01")
                .comValor(new BigDecimal(233))
                .comDataVencimento(new Date())
                .construir();

        Lancamento lancamento4 = LancamentoBuilder.criarLancamento()
                .comCliente("Zenita Vicente", "zenita@exemplo.com", "(47) 99999-5000")
                .comDescricao("NFE000305 Parcela 01 de 02")
                .comValor(new BigDecimal(499))
                .comDataVencimento(new Date())
                .construir();

        return Arrays.asList(lancamento1, lancamento2, lancamento3, lancamento4);
    }
}
