package com.algaworks.fiscal;

import com.algaworks.pessoas.EmpresaLucroReal;
import com.algaworks.pessoas.EmpresaSimples;
import com.algaworks.pessoas.GestorDeImpostos;
import com.algaworks.pessoas.PessoaFisica;

public class PrincipalPessoas {

    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 45_00);
        var maria = new PessoaFisica("Maria Souza", 180_00);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);


        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);


        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());

    }
}