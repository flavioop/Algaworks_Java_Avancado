package com.algaworks.fiscal;

public class PrincipalNotas {

    public static void main(String[] args) {

        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFiscalProduto("Bola futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo roda", 1100, true);


        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

        /*System.out.println(nfBolaFutebol.calcularImpostos());
        System.out.println(nfReparoMotor.calcularImpostos());*/

    }
}