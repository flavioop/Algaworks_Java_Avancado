package com.algaworks.agenda;

public record Horario(int hora, int minuto) {


    public Horario {

        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora invalida: " + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto Invalido: " + minuto);

        }

    }

    public String formatar() {

        return String.format("%dh%dm", hora(), minuto());
    }
}