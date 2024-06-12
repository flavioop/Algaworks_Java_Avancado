package com.algaworks.excecoes.banco;



public class ContaCorrente {


    private String numero;
    private double saldo;
    private boolean ativa;


    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public boolean isInativa(){
        return !isAtiva();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

      public void ativar(){
        this.ativa = true;
    }

    public void inativar(){
        this.ativa = false;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {

            throw new IllegalArgumentException ("Valor de saque deve ser maior que 0");

        }


        if (valor > this.saldo) {

                throw new IllegalArgumentException ("Conta sem saldo");


        }

        if (isInativa()) {

            throw new IllegalArgumentException ("Conta Inativa");

        }

        this.saldo -= valor;
        return true;

    }

    public boolean depositar(double valor){
        if(valor <= 0){

            throw new IllegalArgumentException ("Valor do deposito deve ser maior que 0");
        }

        if(isInativa()){
            throw new IllegalArgumentException ("Conta Inativa");
        }

        this.saldo += valor;
        return true;

    }

    public boolean transferir(ContaCorrente contaDestino, double valor){
        if(contaDestino.isInativa()){
            throw  new IllegalArgumentException ("Conta destino está inativa");

        }

        if (sacar(valor)){
            contaDestino.depositar(valor);
            return true;
        }
            return false;
    }

}