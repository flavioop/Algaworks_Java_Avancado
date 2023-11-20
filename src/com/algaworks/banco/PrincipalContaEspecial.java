package com.algaworks.banco;

public class PrincipalContaEspecial {
        public static void main(String[] args) {
            ContaEspecial conta1 = new ContaEspecial();
            conta1.setTitular(new Titular("João da silva", "11122233344"));
            conta1.setAgencia(1234);
            conta1.setNumero(999999);

            conta1.setLimiteChequeEspecial(1000);
            conta1.setTafiraMensal(90);

            conta1.imprimirDemonstrativo();

            conta1.depositar(100);
            conta1.imprimirDemonstrativo();

            conta1.sacar(200);
            conta1.imprimirDemonstrativo();

            conta1.debitarTarifaMensal();
            conta1.imprimirDemonstrativo();
        }
}