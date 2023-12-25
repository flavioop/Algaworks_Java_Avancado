package com.algaworks.primeiroscodigos;

public class IndMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade(){

        return resultado >=30;

    }

    boolean estaAbaixoDoPesoIdeal(){
        return  resultado < 18.5;
    }

}