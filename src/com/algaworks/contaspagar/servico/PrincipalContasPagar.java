package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.pagamento.Beneficiario;


public class PrincipalContasPagar {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("João da Silva", "11999999999","1123565662");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "229852555225", "123452522225");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);


        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);


    }

}