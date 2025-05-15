package com.algaworks.generics.classegenerica;

import com.algaworks.excecoes.customizadas.Produto;

public class Principal {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));

        Produto produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());


    }

}