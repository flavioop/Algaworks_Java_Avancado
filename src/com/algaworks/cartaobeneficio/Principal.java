package com.algaworks.cartaobeneficio;

import com.algaworks.cartaobeneficio.servico.ServicoDepositoPix;
import com.algaworks.cartaobeneficio.servico.ServicoPagamentoOnline;

public class Principal {
    public static void main(String[] args) {
        var supermecado = new Estabelecimento("Supermecado do Zé");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeposito = new ServicoDepositoPix();
        Recibo reciboDeposito = servicoDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoPagamento = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoPagamento.efetuarPagamento(supermecado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);

    }
}