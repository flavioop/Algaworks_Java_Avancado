package com.algaworks.cartaobeneficio;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao (String titular){
        this.titular = titular;
    }

    public String obterTitular(){
        return titular;
    }

    public double obterSaldo(){
        return saldo;
    }



    public void debitar(double valorDebito){

        if (obterSaldo() < valorDebito){
            throw new IllegalArgumentException(
                    String.format("Valor de deposisto não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));

        }

        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito){

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("Valor de deposisto não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));

        }
        saldo += valorDeposito - TARIFA_DEPOSITO;

    }


}