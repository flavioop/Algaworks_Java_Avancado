package com.algaworks.excecoes.customizadas;

public class BaixaEstoqueException extends Exception {

     public BaixaEstoqueException(String message, Throwable cause) {
        super(message, cause);
    }
}