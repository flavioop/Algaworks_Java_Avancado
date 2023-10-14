public class PrincipalServicoPrecificacao {

    public static void main(String[] args) {

       Produto novoProduto = new Produto();
       novoProduto.precoCusto = 100;

        ServicoPrecificacao servicoPrecificacao =new ServicoPrecificacao();
        servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);


    }

}