package com.algaworks.banco;

public class ContaEspecial {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipo = 0;

    //Conta Investimento
    private double valorTotalRendimentos;

    //Conta Especial
    private  double tafiraMensal;
    private double limiteChequeEspecial;


    public Titular getTitular(

    ) {
        return titular;
    }

    public void setTitular(Titular titular) {

        this.titular = titular;
    }

    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {

        this.agencia = agencia;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public double getSaldo() {

        return saldo;
    }

    public int getTipo() {
        return tipo;
    }


    public double getValorTotalRendimentos() {

        return valorTotalRendimentos;
    }

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

    public void creditarRendimentos(double percentualJuros){


            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);

    }

    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void sacar(double valorSaque){
        if(valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }
        if(getSaldoDisponivel() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }

        saldo -= valorSaque;
   }

   public void depositar(double valorDeposito){
        if(valorDeposito <= 0){
            throw new IllegalArgumentException("Valor deposito deve ser maior que 0");
        }
        saldo += valorDeposito;
   }


   public void debitarTarifaMensal(){

            sacar(getTafiraMensal());

   }

   public void imprimirDemonstrativo(){
       System.out.println();
       System.out.printf("Agência: %d%n", getAgencia());
       System.out.printf("Conta: %d%n", getNumero());
       System.out.printf("Titular: %s%n", getTitular().getNome());
       System.out.printf("Saldo: %.2f%n", getSaldo());
       System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());

   }


}