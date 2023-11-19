package com.algaworks.agenda;

public class Principal2 {

    public static void main(String[] args) {

        Horario horario = new Horario(10, 30);
        Agendamento agendamento = new Agendamento(horario, "Corte de cabelo");

        Horario novoHorario = CalculadoraHorario.somarDuasHoras(horario);

        System.out.println(agendamento.getHorarioFormatado());
        System.out.println(novoHorario.formatar());

    }
}