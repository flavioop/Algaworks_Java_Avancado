package com.algaworks.generics.sorteio;

public class Principal {

    public static void main(String[] args) {

        String[] nomes = {"João", "José", "Maria"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);


        Cliente[] clientes ={
                new Cliente("Supermecado Pague e leve", 2_000_00),
                new Cliente("Posto de Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }

}