package com.algaworks.excecoes.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade){
        if(idade < 18){
            throw new MenorDeIdadeException("Menor de idade não pode ser cadastrado");
        }

        //Todo cadastro aqui

        return new Cliente(nome, idade);
    }

}