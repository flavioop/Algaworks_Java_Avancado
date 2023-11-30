package com.algaworks.banco;

public class PrincipalContaEspecial {
        public static void main(String[] args) {
            /*ContaEspecial conta1 = new ContaEspecial();
            conta1.setTitular(new Titular("João da silva", "11122233344"));
            conta1.setAgencia(12345);
            conta1.setNumero(999999);
            conta1.setLimiteChequeEspecial(1000);
            conta1.setTafiraMensal(90);*/


            /*Titular titular = new Titular("João da Silva", "11122200069");*/
            CaixaEletronico caixaEletronico = new CaixaEletronico();


            ContaEspecial conta1 = new ContaEspecial(new Titular( "João da Silva", "12342500087"), 999999,89254 ,90);

            conta1.setLimiteChequeEspecial(1000);

            ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Joana", "22288800087"), 2222,88888,90);

            ContaSalario conta3 = new ContaSalario(new Titular("Francisco Souza", "15715500387"), 3333,99999,18_000);

            conta1.depositar(300);

            caixaEletronico.trasferir(conta1,conta3, 50);
            conta1.imprimirDemonstrativo();
            conta3.imprimirDemonstrativo();


           /* conta1.imprimirDemonstrativo();

            conta1.depositar(100);
            conta1.imprimirDemonstrativo();

            conta1.sacar(200);
            conta1.imprimirDemonstrativo();

            conta1.debitarTarifaMensal();
            conta1.imprimirDemonstrativo();*/
        }
}