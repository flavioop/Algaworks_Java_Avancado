package com.algaworks.estoque;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "O nome deve ser informado");
        this.nome = nome;
    }

    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void retirarEstoque(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
}