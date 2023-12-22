package com.algaworks.financeira.servico;

import com.algaworks.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento{

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado){
        double limiteAprovado = cliente.calcularLimiteAprovado();

        if(limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        System.out.printf("Debug: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);

    }

    public double consultarLimiteAprovado(ClienteFinanciavel empresa){
        return empresa.calcularLimiteAprovado();

    }


}