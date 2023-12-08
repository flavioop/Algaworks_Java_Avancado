package com.algaworks.pessoas;

import java.util.Objects;

public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despesaAnual;

    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public double getLucroAnual() {
        return getFaturamentoAnual() - getDespesaAnual();
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "faturamentoAnual=" + faturamentoAnual +
                ", despesaAnual=" + despesaAnual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Double.compare(that.faturamentoAnual, faturamentoAnual) == 0 && Double.compare(that.despesaAnual, despesaAnual) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(faturamentoAnual, despesaAnual);
    }


}