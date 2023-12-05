package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TATIFA_TRANSFERENCIA = 10;
    public static final double TATIFA_IMPRESSAO_DEMONSTRATIVO = 5;
    public void trasferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia){
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%dn",
        valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TATIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemostrativo(Conta conta){

        ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

        if(contaInvestimento.getValorTotalRendimentos() > 0){
            System.out.println("Impressão do demonstrativo é gratuito");
        }else{
            System.out.printf("Custo de impressão: R$%.2f%n", TATIFA_IMPRESSAO_DEMONSTRATIVO);
            conta.sacar(TATIFA_IMPRESSAO_DEMONSTRATIVO);
        }

        conta.imprimirDemonstrativo();


    }

}