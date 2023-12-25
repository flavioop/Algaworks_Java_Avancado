package com.algaworks.primeiroscodigos;

public class PrincipalFolhaPagamento {

    public static void main(String[] args) {
        FuncionariosFolhaPagamento funcionario = new FuncionariosFolhaPagamento();
        funcionario.nome = "João da Silva";
        funcionario.quantidadeFilhos = 2;

        ContratoDeTrabalhoFolhaDePagamento contratoTrabalho = new ContratoDeTrabalhoFolhaDePagamento();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);
        holerite.imprimir();
    }
}