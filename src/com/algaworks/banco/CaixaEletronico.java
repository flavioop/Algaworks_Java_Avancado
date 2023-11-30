package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TATIFA_TRANSFERENCIA = 10;
    public void trasferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia){
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%dn",
        valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TATIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }


}