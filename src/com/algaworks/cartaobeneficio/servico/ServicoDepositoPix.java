package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        //TODO faz cobrança no Pix



        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("Valor de deposisto não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));

        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);

    }
}