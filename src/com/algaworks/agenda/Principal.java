package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario( 10, 55);

        //System.out.printf("%dh%dm", horario.getHora(), horario.getMinuto());
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        //horario.setHora(11);
        //horario.setMinuto(45);
        Agendamento agendamentoBarba = new Agendamento(horario, "Feitio de barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);

        /*System.out.println(horario.formatar());*/
    }

    public static void imprimir(Agendamento agendamento){
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }

}