package com.algaworks.locadora;

public class PrincipalNotebook {

    public static void main(String[] args) {


        Notebook notebook = new Notebook("Mcbook Pro 17 16gb", 5, 100);
        Precificacao precificacao = new PrecificacaoPorHora();
        Seguro seguro = new SeguroItau();

        Locacao locacao = new Locacao(notebook, precificacao, seguro);
        double valorDevido = locacao.calcularValorDevido(10);

        //Locacao locacao = new LocacaoPorDiaSeguroItau(notebook);
        //Locacao locacao = new LocacaoPorHora(notebook);
        //double valorDevido = locacao.calcularValorDevido(10);


        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}