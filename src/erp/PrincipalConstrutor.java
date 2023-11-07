package erp;

import com.algaworks.erp.estoque.ProdutoConstrutor;


public class PrincipalConstrutor {
    public static void main(String[] args) {



        ProdutoConstrutor produto1 = new ProdutoConstrutor("Picanha 1Kg (peça)", 100);
        ProdutoConstrutor produto2 = new ProdutoConstrutor("Maminha 1Kg (peça)");
        /*ProdutoConstrutor produto3 = new ProdutoConstrutor();*/


        System.out.println(produto1.codigo);
        System.out.println(produto1.nome);
        System.out.println(produto1.quantidaEstoque);

        System.out.println(produto2.codigo);
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidaEstoque);

        System.out.println(produto3.codigo);
        System.out.println(produto3.nome);
        System.out.println(produto3.quantidaEstoque);

    }

}