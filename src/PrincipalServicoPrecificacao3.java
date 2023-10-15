public class PrincipalServicoPrecificacao3 {

    public static void main(String[] args) {

        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f", Produto.calcularCustosTotais(produto));


    }

}