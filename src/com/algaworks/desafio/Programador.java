package com.algaworks.desafio;

public class Programador extends Funcionario{

    private double valorBonus;

    Programador(String nome, double valorHora){
        super (nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if(valorBonus < 0){
            throw new IllegalArgumentException("Valor bonus deve ser maior que 0");
        }
        this.valorBonus = valorBonus;
    }
    @Override
    protected final double calculaSalario(int horasTrabalhadas){
        return super.calculaSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                ", valorBonus=" + valorBonus +
                '}';
    }
}