package com.algaworks.financeira.servico;
import com.algaworks.financeira.modelo.Empresa;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(Empresa empresa, double valorSolicitado){
        double limiteAprovado = empresa.calcularLimiteAprovado();

        if(limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        System.out.printf("Debug: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);

    }

    public double consultarLimiteAprovado(Empresa empresa){
        return empresa.calcularLimiteAprovado();

    }



}