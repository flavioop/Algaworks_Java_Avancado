package com.algaworks.contaspagar.servico;


import com.algaworks.contaspagar.servico.pagamento.DocumentoPagavel;
import com.algaworks.contaspagar.servico.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        //Beneficiario beneficiario = documento.getBeneficiario();


        metodoPagamento.pagar(documento);

    }
}