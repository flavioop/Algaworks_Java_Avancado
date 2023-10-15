public class PrincipalServicoPrecificacao {

    public static void main(String[] args) {

        Produto.custoEmbalagem = 10;

       Produto novoProduto = new Produto();
       novoProduto.precoCusto = 100;

        ServicoPrecificacao servicoPrecificacao =new ServicoPrecificacao();
        servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);
        System.out.printf("Preço: %.2f%n", novoProduto.precoCusto);

    }

}