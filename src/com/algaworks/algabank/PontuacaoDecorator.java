package com.algaworks.algabank;
import com.algaworks.algabank.javabank.Conta;
public class PontuacaoDecorator extends ContaBaseDecorator{


    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }
    @Override
    public void depositar(double valor){
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }

    public int getPontos() {
        return pontos;
    }


}