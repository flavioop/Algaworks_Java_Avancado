package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.println("Cobra frete: ");
        boolean cobraFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if(cobraFrete){
            System.out.println("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = precoProdutos + valorFrete;

        System.out.printf("Valor total: R$%.2f%n ", valorTotal);

    }
}