package com.algaworks.financeira;
import com.algaworks.financeira.modelo.*;
import com.algaworks.financeira.servico.ServicoFinanciamento;

public class PrincipalFinanceira {

    public static void main(String[] args) {

        var servicoFinancamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 20000, 110000);
        var funcionario = new Funcionario("João da Silva", 18_000);

        /*servicoFinancamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinancamento.solicitarFinanciamento(industria, 530_000);
        servicoFinancamento.solicitarFinanciamento(fazenda, 400_000);*/

        System.out.println(ClienteFinanciavel.isFinanciamentioGrandeValor(500_000));

    }

}