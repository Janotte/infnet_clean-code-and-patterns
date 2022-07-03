package com.exemplo.patterns.builder;

import com.exemplo.patterns.models.Cliente;
import com.exemplo.patterns.models.ItemDeVenda;
import com.exemplo.patterns.models.Pedido;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBuilder {

    private Pedido instancia;

    public PedidoBuilder() {
        this.instancia = new Pedido();
    }

    public PedidoBuilder comNumero(String numero) {
        instancia.setNumero(numero);

        return this;
    }

    public PedidoBuilder adicionarCliente(String nome, String email) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);

        this.instancia.setCliente(cliente);

        return this;
    }

    public PedidoBuilder adicionarItem(String nome, Integer quantidade, BigDecimal valorDeVenda) {
        ItemDeVenda itemDeVenda = new ItemDeVenda();
        itemDeVenda.setNome(nome);
        itemDeVenda.setQuantidade(quantidade);
        itemDeVenda.setValorDeVenda(valorDeVenda);

        if (this.instancia.getItens() == null) {
            this.instancia.setItens(new ArrayList<ItemDeVenda>());
        }

        this.instancia.getItens().add(itemDeVenda);

        return this;

    }

    public Pedido construir() {
        return this.instancia;
    }
}
