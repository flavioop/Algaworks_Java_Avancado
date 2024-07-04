package com.algaworks.generics.sorteio;

public class Cliente {

    private String razaoSocial;
    private double faturaMensal;

    public Cliente(String razaoSocial, double faturaMensal) {
        this.razaoSocial = razaoSocial;
        this.faturaMensal = faturaMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturaMensal() {
        return faturaMensal;
    }

    public void setFaturaMensal(double faturaMensal) {
        this.faturaMensal = faturaMensal;
    }
}