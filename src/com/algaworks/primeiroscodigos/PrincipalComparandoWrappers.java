package com.algaworks.primeiroscodigos;

public class PrincipalComparandoWrappers {

    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        System.out.println(numero1.equals(numero2));
        System.out.println(numero1.intValue() == numero3.intValue());

    }

}