package com.algaworks.locadora;

public class PrincipalNotebook {

    public static void main(String[] args) {


        Notebook notebook = new Notebook("Mcbook Pro 17 16gb", 5, 100);

        Locacao locacao = new LocacaoPorDiaSeguroItau(notebook);
        //Locacao locacao = new LocacaoPorHora(notebook);
        double valorDevido = locacao.calcularValorDevido(10);


        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}