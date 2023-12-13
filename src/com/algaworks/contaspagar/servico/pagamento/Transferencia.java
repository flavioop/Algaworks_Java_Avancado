package com.algaworks.contaspagar.servico.pagamento;

public class Transferencia implements MetodoPagamento{


    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Benefeciario não conta bancaria");
        }

        System.out.printf("DEBUG: Efetuando transferencia para %s no valor de %.2f para conta bancaria %s%n", beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());

    }
}