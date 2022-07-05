package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculadoraService implements Calculadora {

    @Override
    public double calcularDistancia(Pontos pontosDeEntrada) {
        return Math.sqrt(
                Math.pow((pontosDeEntrada.getPontoX2() - pontosDeEntrada.getPontoX1()), 2) +
                        Math.pow((pontosDeEntrada.getPontoY2() - pontosDeEntrada.getPontoY1()), 2));
    }

    @Override
    public void exibirDistancia(double distancia) {
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println(formatter.format(distancia));
    }
}
