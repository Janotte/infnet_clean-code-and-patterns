package com.exemplo.patterns.models;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    private String numero;
    private Cliente cliente;
    private List<ItemDeVenda> itens;

    public Pedido() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDeVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemDeVenda> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemDeVenda itemDeVenda : itens){
            valorTotal = valorTotal.add(new BigDecimal(itemDeVenda.getQuantidade()).multiply(itemDeVenda.getValorDeVenda()));
        }

        return valorTotal;
    }
}
