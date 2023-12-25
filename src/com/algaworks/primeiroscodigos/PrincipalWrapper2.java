package com.algaworks.primeiroscodigos;

public class PrincipalWrapper2 {

    public static void main(String[] args) {
        ClienteWrapper cliente = new ClienteWrapper();
        cliente.idade = Integer.valueOf(20);

        System.out.printf("Idade: %d%n", cliente.idade);

    }
}