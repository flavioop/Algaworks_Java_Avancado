package com.algaworks.primeiroscodigos;

public class PrincipalVisitante {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 10);
        cadastroPortaria.cadastrar(novoVisitante,2);


    }
}