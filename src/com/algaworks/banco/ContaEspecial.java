package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento{



    //Conta Especial
    private  double tafiraMensal;
    private double limiteChequeEspecial;


    public double getTafiraMensal() {

        return tafiraMensal;
    }

    public void setTafiraMensal(double tafiraMensal) {

        this.tafiraMensal = tafiraMensal;
    }

    public double getLimiteChequeEspecial() {

        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {


        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    protected void validarSaldoParaSaque(double valorSaque){
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

   public void debitarTarifaMensal(){

            sacar(getTafiraMensal());
   }



}