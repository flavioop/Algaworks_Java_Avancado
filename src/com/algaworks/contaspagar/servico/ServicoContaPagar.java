package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.servico.pagamento.Beneficiario;
import com.algaworks.contaspagar.servico.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento){

        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Benefeciario não possui chave Pix");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%", beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());

    }
}