package com.exemplo.patterns.builder;

import com.exemplo.patterns.models.Pedido;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    void deveCalcularOTotalDoPedido() {
        Pedido pedido = new PedidoBuilder()
                .comNumero("PE0001")
                .adicionarCliente("Nome do Cliente", "email@exemplo.com")
                .adicionarItem("Caneta Big", 2,new BigDecimal(10))
                .adicionarItem("Regua de 30cm Faber Castel", 1,new BigDecimal(12))
                .adicionarItem("Caderno pequeno 50 folhas", 5,new BigDecimal(17))
                .adicionarItem("Penal grande Loli Pop", 1,new BigDecimal(25))
                .construir();

        assertEquals(new BigDecimal(142),pedido.getValorTotal());
    }
}
