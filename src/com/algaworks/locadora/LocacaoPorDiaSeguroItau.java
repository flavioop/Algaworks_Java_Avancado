package com.algaworks.locadora;

public class LocacaoPorDiaSeguroItau extends LocacaoPorDia {
    public LocacaoPorDiaSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);

        valorTotal += (horasUtilizadas * 0.5) + (valorTotal * 0.05);
        return valorTotal;
    }

}