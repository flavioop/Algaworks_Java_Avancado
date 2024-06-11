package com.algaworks.excecoes.JavaExceptionBreakpoints;

public class Principal {

    public static void main(String[] args) {
        int idade = 17;
        try{
            if(idade < 15){
                throw new IllegalArgumentException("Menor de idade");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}