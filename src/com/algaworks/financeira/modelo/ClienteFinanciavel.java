package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    public abstract double calcularLimiteAprovado();


    default double calcularJuros(double valorSolicitado) {
        if(isFinanciamentoMedioValor(valorSolicitado)) {
            return 1.0;
        }else if (isFinanciamentioGrandeValor(valorSolicitado)){
            return 1.5;

        }

        return 2.0;
    }

    static boolean isFinanciamentioGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }
    static boolean isFinanciamentoMedioValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
    

}