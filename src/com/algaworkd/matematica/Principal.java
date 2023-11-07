package com.algaworkd.matematica;

import static com.algaworkd.matematica.CalculadoraArea.*;

public class Principal {

    public static void main(String[] args) {

        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.printf("PI: %2.f%n", PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);
    }

}