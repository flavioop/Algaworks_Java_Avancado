package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.servico.pagamento.DocumentoPagavel;

public class PrincipalContasPagar {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

         DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);


    }

}