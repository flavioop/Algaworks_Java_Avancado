public class ProdutoConstrutor {

    String nome;
    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
    int quantidaEstoque;
    ProdutoConstrutor(String nome){

       this.nome = nome;
        this.quantidaEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

}