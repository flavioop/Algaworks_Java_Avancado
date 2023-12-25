package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso ideal");
        }
        if(imc >= 18.5 && imc < 25){
            System.out.println("Está no peso ideal");
        }
        if(imc >= 25 && imc < 30){
            System.out.println("Acima do peso ideal");
        }
        if(imc >=30 && imc < 35){
            System.out.println("Obesidade Grau I");
        }
        if(imc >=35 && imc < 40){
            System.out.println("Obesidade Grau II");
        }
        if(imc >=40){
            System.out.println("Obesidade Grau III");
        }

        System.out.println("Fim do programa");

    }
}