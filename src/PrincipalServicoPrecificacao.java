public class PrincipalServicoPrecificacao {

    public static void main(String[] args) {

        double precoCompraFornecedor = 140;

        ServicoPrecificacao servicoPrecificacao =new ServicoPrecificacao();
        servicoPrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);


    }

}