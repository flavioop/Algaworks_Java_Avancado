public class CadastroPortaria {


    public static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }


    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMEses){

        final int tempoExpiracaoEmdias  = tempoExpiracaoEmMEses * 30;
        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmdias);

    }
}