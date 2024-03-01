package com.algaworks.algabank;

import com.algaworks.banco.ContaSalario;
import com.algaworks.algabank.javabank.Conta;

import java.util.Objects;

public abstract class ContaBaseDecorator implements Conta {

    private Conta contaOriginal;

    public ContaBaseDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }


    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);

    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    public void setContaOriginal(Conta contaOriginal) {
        this.contaOriginal = contaOriginal;
    }


    @Override
    public void imprimirSaldo() {
        contaOriginal.imprimirSaldo();
    }
}