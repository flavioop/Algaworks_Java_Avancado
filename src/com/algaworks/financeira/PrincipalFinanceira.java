package com.algaworks.financeira;
import com.algaworks.financeira.servico.ServicoFinanciamento;
import com.algaworks.financeira.modelo.Fazenda;
import com.algaworks.financeira.modelo.Industria;
public class PrincipalFinanceira {

    public static void main(String[] args) {

        var servicoFinancamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);

        servicoFinancamento.solicitarFinanciamento(fazenda, 600_000);
        //servicoFinanciamento.solicitarFinanciamento(industria, 600_000);
    }

}