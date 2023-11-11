package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        //TODO faz cobrança no Pix



        cartao.depositar(valorDeposito);


        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);

    }
}