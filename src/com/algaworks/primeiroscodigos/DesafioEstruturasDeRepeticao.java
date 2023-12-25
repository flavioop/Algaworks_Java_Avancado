package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class DesafioEstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            somaNumeros += entrada.nextInt();

        }

        System.out.println(somaNumeros);




    }

}