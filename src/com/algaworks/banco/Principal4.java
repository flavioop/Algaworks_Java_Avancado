package com.algaworks.banco;

public class Principal4 {
    public static void main(String[] args) {
       /* Titular titular = new Titular("João da Silva", "11122233344");
        Conta conta1 = new Conta(titular, 1234, 999999);*/


        /*Titular titular = new Titular("João da Silva", "11122200069");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 999999);*/

        Titular titular = new Titular("João da Silva", "11122200069");
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);

        System.out.println(conta1);


    }

}