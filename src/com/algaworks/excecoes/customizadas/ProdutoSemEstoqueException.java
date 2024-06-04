package com.algaworks.excecoes.customizadas;

public class ProdutoSemEstoqueException extends RuntimeException{
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}