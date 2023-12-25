package com.algaworks.primeiroscodigos;

import java.util.Scanner;

public class HorarioFuncionamento2 {
                public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                System.out.println("Digite um dia da semana (ex: seg, ter, qua, qui, sex, sab, dom)");
                String diaSemana = entrada.next();
                String horarioFuncionamento;

                switch (diaSemana){
                    case "seg" -> horarioFuncionamento = "Fechado";
                    case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
                    case "sab", "dom" -> {
                        horarioFuncionamento = "08:00 às 12:00";
                    }
                    default ->  horarioFuncionamento = "Dia inválido";
                }

                System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);

            }
        }