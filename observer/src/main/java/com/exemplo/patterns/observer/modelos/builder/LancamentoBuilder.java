package com.exemplo.patterns.observer.modelos.builder;

import com.exemplo.patterns.observer.modelos.Cliente;
import com.exemplo.patterns.observer.modelos.Lancamento;

import java.math.BigDecimal;
import java.util.Date;

public class LancamentoBuilder {

    private Lancamento instancia;

    public static LancamentoBuilder criarLancamento() {
        return new LancamentoBuilder();
    }

    public LancamentoBuilder() {
        this.instancia = new Lancamento();
    }

    public LancamentoBuilder comCliente(String nome, String email, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        this.instancia.setCliente(cliente);

        return this;
    }

    public LancamentoBuilder comDescricao(String descricao) {
        this.instancia.setDescricao(descricao);
        return this;
    }

    public LancamentoBuilder comValor(BigDecimal valor) {
        this.instancia.setValor(valor);
        return this;
    }

    public LancamentoBuilder comDataVencimento(Date dataDeVencimento) {
        this.instancia.setDataDeVencimento(dataDeVencimento);
        return this;
    }

    public Lancamento construir() {
        return this.instancia;
    }
}
