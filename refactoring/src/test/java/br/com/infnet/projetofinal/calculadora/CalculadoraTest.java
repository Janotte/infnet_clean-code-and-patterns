package br.com.infnet.projetofinal.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void calcularDistanciaTest() {
        CalculadoraService calculadora = new CalculadoraService();
        Pontos pontos = new Pontos();
        pontos.setPontoX1(1);
        pontos.setPontoX2(9);
        pontos.setPontoY1(3);
        pontos.setPontoY2(9);

        assertEquals(10D,calculadora.calcularDistancia(pontos));
    }
}
