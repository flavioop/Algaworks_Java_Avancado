public class ServicoDeCobranca {
    void pagar (Fatura fatura, String emailCobranca ,String... emailsAdicionais){


        enviarNotificacao(fatura, emailCobranca);
        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, fatura.valorTotal);

        for (String email : emailsAdicionais){
            //System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
            enviarNotificacao(fatura, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email){
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero,email);

    }
}