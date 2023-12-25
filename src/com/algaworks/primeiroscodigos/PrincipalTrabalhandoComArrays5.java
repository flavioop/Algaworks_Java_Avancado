package com.algaworks.primeiroscodigos;

import java.util.Arrays;
import java.util.Comparator;

public class PrincipalTrabalhandoComArrays5 {

    public static void main(String[] args) {
        Integer[] notas = {8,5,4,9,10};

        //ordem crescente
        Arrays.sort(notas);

        //ordem decrescente
        Arrays.sort(notas, Comparator.reverseOrder());



        System.out.println(Arrays.toString(notas));
    }
}