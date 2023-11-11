package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Estabelecimento;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoPagamentoOnline {


    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        cartao.debitar(valor);

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);

    }

}