package com.algaworks.excecoes.estoque;
import com.algaworks.excecoes.estoque.Produto;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("");

        produto.adicionarEstoque(1000);;
        produto.ativar();


        produto.retirarEstoque(5);

        System.out.printf("Estoque %d%n", produto.getQuantidadeEstoque());

    }

}