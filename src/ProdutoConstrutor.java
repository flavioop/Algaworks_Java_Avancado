public class ProdutoConstrutor {

    String nome;
    static final int QUANTIDADE_INICAL_ESTOQUE = 100;
    int quantidaEstoque;

    ProdutoConstrutor(){
        this.nome = "sem nome";
        this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;
    }
    ProdutoConstrutor(String nome ){

       this.nome = nome;
       this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;

    }


    ProdutoConstrutor(String nome, int estoqueInicial ){

        this.nome = nome;
        this.quantidaEstoque = estoqueInicial;
    }


}