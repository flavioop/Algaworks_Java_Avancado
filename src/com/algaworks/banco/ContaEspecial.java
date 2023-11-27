package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento{



    //Conta Especial
    private  double tafiraMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tafiraMensal) {
        super(titular, agencia, numero);
        this.tafiraMensal = tafiraMensal;
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

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }
    @Override
    protected final void validarSaldoParaSaque(double valorSaque){
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

   public void debitarTarifaMensal(){

            sacar(getTafiraMensal());
   }
    @Override
    public final void imprimirDemonstrativo() {

        super.imprimirDemonstrativo();

        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());

    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimento=" + getValorTotalRendimentos() +
                ", tarifaMensal=" + tafiraMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }



}