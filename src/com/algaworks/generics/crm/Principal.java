package com.algaworks.generics.crm;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Supermecado Pague e Leve", 500_00));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_00));

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes){

            totalFaturamento += cliente.getFaturamentoMensal();

        }

        System.out.println(totalFaturamento);

    }


}