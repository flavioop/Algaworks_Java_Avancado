public class CadastroPortaria {
    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMEses){
        final int tempoExpiracaoEmdias  = tempoExpiracaoEmMEses * 30;


        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmdias);

    }
}