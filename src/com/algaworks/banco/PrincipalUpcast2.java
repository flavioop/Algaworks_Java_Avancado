package com.algaworks.banco;

public class PrincipalUpcast2 {

    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva", "22255588869");
        Conta conta = new ContaSalario(titular, 1234, 99999,1000);


    }

}