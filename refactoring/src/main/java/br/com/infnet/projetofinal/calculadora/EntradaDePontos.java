package br.com.infnet.projetofinal.calculadora;

import java.util.Scanner;

public class EntradaDePontos {

    public Pontos obterPontos() {

        Scanner entrada = new Scanner(System.in);
        Pontos pontos = new Pontos();

        System.out.println("Digite x1");
        pontos.setPontoX1(entrada.nextInt());
        System.out.println("Digite x2");
        pontos.setPontoX2(entrada.nextInt());
        System.out.println("Digite y1");
        pontos.setPontoY1(entrada.nextInt());
        System.out.println("Digite y2");
        pontos.setPontoY2(entrada.nextInt());

        return pontos;
    }
}
