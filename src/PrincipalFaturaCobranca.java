public class PrincipalFaturaCobranca {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

        //String[] emailCobranca = new {"joao@algaworks.com.br","maria@algaworks.com.br" };
        //servicoDeCobranca.pagar(fatura, emailCobranca);


        servicoDeCobranca.pagar(fatura, new String[]{"joao@algaworks.com.br","maria@algaworks.com.br" } );

        //servicoDeCobranca.pagar(fatura, new String[0]);
        //servicoDeCobranca.pagar(fatura, new String[]{});

        //servicoDeCobranca.pagar(fatura, ...emailsCobranca: "joao@algaworks.com.br","maria@algaworks.com.br");

    }
}