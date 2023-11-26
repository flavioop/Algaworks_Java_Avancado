package com.algaworks.banco;

public class PrincipalConta {

    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva", "11122200069");
        Conta conta1 = new Conta(titular, 1234, 999999);

        /*conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);*/

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();
    }

}