package com.algaworks.algabank;

import com.algaworks.algabank.javabank.Conta;

import java.util.Objects;

public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    private Conta contaOriginal;

    public TributacaoDecorator(Conta contaOriginal) {

        super(contaOriginal);
    }


    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }



    @Override
    public void transferir(Conta conta, double valor) {
        getContaOriginal().transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor){
        getContaOriginal().aplicarEmInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    public void debitarImpostoMovimentacao(double valorMovimentacao) {
        getContaOriginal().sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}