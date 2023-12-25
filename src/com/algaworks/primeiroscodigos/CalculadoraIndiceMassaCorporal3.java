package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal3 {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe o Genero, 1 para mulher e 2 para homem: ");
            int genero = entrada.nextInt();

            System.out.println("Peso: ");
            int peso = entrada.nextInt();

            System.out.println("altura: ");
            double altura = entrada.nextDouble();

            double imc = peso / (altura * altura);

            if((genero == 1 && imc < 19.1) || (genero == 2 && imc < 20.7)){
                System.out.println("Abaixo do peso ideal");
            }else if((genero == 1 && imc >= 19.1 && imc < 25.8) || (genero == 2 && imc >= 20.8 && imc < 26.4)){
                System.out.println("Está no peso ideal");
            }else if((genero == 1 && imc >= 25.9 && imc < 27.3) || (genero == 2 && imc >= 26.5 && imc < 27.8)){
                System.out.println("Acima do peso ideal");
            }else if((genero == 1 && imc >= 27.4 && imc < 32.3) || (genero == 2 && imc >= 27.9 && imc < 31.1)){
                System.out.println("Obesidade Grau I");
            }else{
                System.out.println("Obesidade Grau II");
            }

            System.out.println("Fim do programa");

    }

}