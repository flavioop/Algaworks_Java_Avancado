package com.algaworks.financeira.modelo;

public class Funcionario extends EmpresaFinanciavel{

    private  double salarioMensal;
    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;


    public Funcionario(String nome, double salarioMensal) {
        super(nome, 0);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }
}