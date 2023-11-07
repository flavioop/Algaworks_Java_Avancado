package com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class ProdutoConstrutor {

    public String nome;
    public final String codigo;
    public static final int QUANTIDADE_INICAL_ESTOQUE = 80;
    public int quantidaEstoque;

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
        this.codigo = UUID.randomUUID().toString();
    }



}