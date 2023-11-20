package com.algaworks.banco;

public class ContaInvestimento {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipo = 0;


    private double valorTotalRendimentos;


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {

        this.titular = titular;
    }

    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {

        this.agencia = agencia;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public double getSaldo() {

        return saldo;
    }

    public int getTipo() {
        return tipo;
    }


    public double getValorTotalRendimentos() {

        return valorTotalRendimentos;
    }


    public void creditarRendimentos(double percentualJuros) {

        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);


    }


    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }
        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor deposito deve ser maior que 0");
        }
        saldo += valorDeposito;
    }


    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());

    }


}