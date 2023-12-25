package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Oi, %s%n", nome);
    }


}