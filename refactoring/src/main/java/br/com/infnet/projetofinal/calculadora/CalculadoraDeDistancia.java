package br.com.infnet.projetofinal.calculadora;

public class CalculadoraDeDistancia {

    public static void main(String[] args) {

        CalculadoraService calculadora = new CalculadoraService();
        EntradaDePontos entradaDePontos = new EntradaDePontos();
        calculadora.exibirDistancia(calculadora.calcularDistancia(entradaDePontos.obterPontos()));
    }
}
