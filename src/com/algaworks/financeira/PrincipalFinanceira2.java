package com.algaworks.financeira;

import com.algaworks.erp.comercial.Cliente;
import com.algaworks.financeira.modelo.Fazenda;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.PessoaBonificavel;
import com.algaworks.financeira.servico.ServicoPagamentoBonus;

public class PrincipalFinanceira2 {

    public static void main(String[] args) {
        //Cliente funcionario = new Funcionario("João da Silva", 18_0000);
        //funcionario.calcularBonus(80);

        //Fazenda fazenda = new Fazenda("Dona Benedita", 1_000_000);
        //fazenda.calcularBonus(80);

        /*PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_0000);
        funcionario.calcularBonus(80);*/

        Funcionario funcionario1 = new Funcionario("João da Silva", 18_000);
        //funcionario.calcularBonus(80);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario1, 100);

    }

}