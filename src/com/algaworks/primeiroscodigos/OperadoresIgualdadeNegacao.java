package com.algaworks.primeiroscodigos;

public class OperadoresIgualdadeNegacao {

    public static void main(String[] args) {

        boolean numerosIguais = 10 == 10;
        boolean numerosIguais2 = (4+6) == (5*2);
        int numero1 = 10;
        int numero2 = 11;
        boolean numerosIguais3 = 10 == numero1;
        boolean numerosIguais4 = numero2  == numero1;
        boolean numerosDiferentes = !numerosIguais;
        boolean numerosDiferentes2 = !(numero1 == numero2);
        boolean numerosDiferentes3 = numero1 != numero2;
        String nome1 = "Thiago";
        String nome2 = "Miguel";
        boolean nomesIguais = nome1 == nome2;



        System.out.printf("Numeros iguais1: %b%n", numerosIguais);
        System.out.printf("Numeros iguais2: %b%n", numerosIguais2);
        System.out.printf("Numeros iguais3: %b%n", numerosIguais3);
        System.out.printf("Numeros iguais4: %b%n", numerosIguais4);
        System.out.printf("Numeros Diferentes: %b%n", numerosDiferentes);
        System.out.printf("Numeros Diferentes2: %b%n", numerosDiferentes2);
        System.out.printf("Numeros Diferentes2: %b%n", numerosDiferentes3);
        System.out.printf("Nomes iguais: %b%n", nomesIguais);

    }
}