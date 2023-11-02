public class PrincipalConstrutor {
    public static void main(String[] args) {

        ProdutoConstrutor produto1 = new ProdutoConstrutor("Picanha 1Kg (peça)", 10);
        ProdutoConstrutor produto2 = new ProdutoConstrutor("Maminha 1Kg (peça)");
        ProdutoConstrutor produto3 = new ProdutoConstrutor();


        System.out.println(produto1.nome);
        System.out.println(produto1.quantidaEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidaEstoque);

        System.out.println(produto3.nome);
        System.out.println(produto3.quantidaEstoque);

    }

}