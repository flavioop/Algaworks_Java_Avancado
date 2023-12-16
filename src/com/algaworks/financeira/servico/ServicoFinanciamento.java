package com.algaworks.financeira.servico;
import com.algaworks.financeira.modelo.Empresa;
import com.algaworks.financeira.modelo.EmpresaFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(EmpresaFinanciavel empresa, double valorSolicitado){
        double limiteAprovado = empresa.calcularLimiteAprovado();

        if(limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        System.out.printf("Debug: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);

    }

    public double consultarLimiteAprovado(EmpresaFinanciavel empresa){
        return empresa.calcularLimiteAprovado();

    }



}