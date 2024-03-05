package com.algaworks.loja;

import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;

public class Principal {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("123123123");
        /*Transferencia metodoPagamento = new Transferencia("999", "7777");*/


        carrinho.finalizar(metodoPagamento);

    }

}