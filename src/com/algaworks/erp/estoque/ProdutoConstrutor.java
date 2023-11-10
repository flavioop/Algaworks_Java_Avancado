package com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class ProdutoConstrutor {

    private String nome;

    private final String codigo;
    private static final int QUANTIDADE_INICAL_ESTOQUE = 80;
    private int quantidaEstoque;

    public ProdutoConstrutor(){

        this("sem nome");
    }

    /*erp.estoque.ProdutoConstrutor(){
        this.nome = "sem nome";
        this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;
    }*/



    public ProdutoConstrutor(String nome ){
       this(nome, QUANTIDADE_INICAL_ESTOQUE);

        /*Objects.requireNonNull(nome, "Nome é obrigatório");
       this.nome = nome;
       this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;*/

    }


    public ProdutoConstrutor(String nome, int estoqueInicial ){
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque Inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidaEstoque = estoqueInicial;
        this.codigo = gerarCodigo();
    }

    private String gerarCodigo(){
        return UUID.randomUUID().toString();
    }

class Fornecedor{

}

class Categoria{

}

}