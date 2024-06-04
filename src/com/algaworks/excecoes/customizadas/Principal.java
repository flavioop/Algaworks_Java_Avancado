package com.algaworks.excecoes.customizadas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Apple Watch");

        //produto.ativar();
        produto.adicionarEstoque(100);;

        /*produto.retirarEstoque(5);

        System.out.printf("Estoque %d%n", produto.getQuantidadeEstoque());*/

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {

                System.out.println("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro na compra: " + iae.getMessage());
            } catch(ProdutoSemEstoqueException e){
                System.out.println("Erro na compra: " + e.getMessage());
            } catch (ProdutoInativoException e) {
                System.out.println("Erro na compra: " + e.getMessage());

                System.out.println("Deseja ativar o produto?");

                if (scanner.nextBoolean()){
                    produto.ativar();
                }else{
                    System.out.println("OK. compra não pode ser realizada");
                    break;
                }
        }

        } while (true);
    }


    private static void efetuarBaixaEstoque(Produto produto, int quantidade){
        //try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());

        //}catch (IllegalArgumentException iae){
          //  System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
            //throw iae;
        //}

    }






}