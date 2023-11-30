package com.algaworks.banco;

public class PrincipalUpCast {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "11122233344");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = (Conta)contaEspecial;


    }
}