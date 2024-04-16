package com.algaworks.estoque;

import com.algaworks.excecoes.estoque.Produto;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("");
        produto.adicionarEstoque(100);

        produto.ativar();

        produto.retirarEstoque( 1);

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());


    }

}