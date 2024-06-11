package com.algaworks.excecoes.cadastroanuncio;

public class Principal {
    public static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("123", "Teste");

        System.out.println("Anuncio Cadastrado");
    }
}