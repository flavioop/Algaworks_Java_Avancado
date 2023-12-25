package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu cortisol: ");
        double cortisol = entrada.nextDouble();

        //cortisol ideal é de 6 a 18.4

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

        System.out.printf("Cortisol normal: %b%n", resultadoNormal);
        System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);

    }
}