package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Estabelecimento;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoPagamentoOnline {


    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){
        if (cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        return new Recibo(cartao.titular, "Pagamento", valor);

    }

}