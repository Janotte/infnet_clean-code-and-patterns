package com.exemplo.patterns.observer.observadores;

import com.exemplo.patterns.observer.modelos.Lancamento;
import com.exemplo.patterns.observer.notificador.Notificador;

import java.util.List;

public class EmailListener implements Listener {

    private Notificador notificador;

    public EmailListener(Notificador notificador) {
        this.notificador = notificador;
        this.notificador.registrarListener(this);
    }

    @Override
    public void atualizar() {
        List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();

        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Notificando cliente por e-mail ------------------------------");
            System.out.println("Nome     : " + lancamento.getCliente().getNome());
            System.out.println("Email    : " + lancamento.getCliente().getEmail());
            System.out.println("Descrição: " + lancamento.getDescricao());
            System.out.println("Valor    : " + lancamento.getValor().setScale(2));
            System.out.println("------------------------------------------------------------");
        }
    }
}
