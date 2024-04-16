package com.algaworks.excecoes.estoque;
import com.algaworks.excecoes.estoque.Produto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);;
        produto.ativar();

        /*produto.retirarEstoque(5);

        System.out.printf("Estoque %d%n", produto.getQuantidadeEstoque());*/

        comprar(produto);
    }

    private static void comprar(Produto produto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();

        efetuarBaixaEstoque(produto, quantidade);
        System.out.println("Compra realizada");

    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade){
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
    }






}