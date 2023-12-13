package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.servico.pagamento.*;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento){

        Beneficiario beneficiario = documento.getBeneficiario();

        MetodoPagamento metodoPagamento = new Transferencia();
        metodoPagamento.pagar(documento);

    }
}