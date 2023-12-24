package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    public abstract double calcularLimiteAprovado();


    default double calcularJuros(double valorSolicitado) {
        if(isFinanciamentoMedioValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        }else if (isFinanciamentioGrandeValor(valorSolicitado)){
            return JUROS_MEDIO_RISCO;

        }

        return JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentioGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }
    static boolean isFinanciamentoMedioValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
    

}