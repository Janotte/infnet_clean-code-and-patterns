package com.exemplo.patterns.observer.notificador;

import com.exemplo.patterns.observer.modelos.Lancamento;
import com.exemplo.patterns.observer.observadores.Listener;

import java.util.List;

public interface Notificador {

    void registrarListener(Listener listener);
    void removerListener(Listener listener);
    void notificarListeners();
    void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);
    List<Lancamento> getLancamentosVencidos();
}
