import java.util.Objects;

public class ProdutoConstrutor {

    String nome;
    static final int QUANTIDADE_INICAL_ESTOQUE = 100;
    int quantidaEstoque;

    ProdutoConstrutor(){
        this.nome = "sem nome";
        this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;
    }
    ProdutoConstrutor(String nome ){
        Objects.requireNonNull(nome, "Nome é obrigatório");
       this.nome = nome;
       this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;

    }


    ProdutoConstrutor(String nome, int estoqueInicial ){
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque Inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidaEstoque = estoqueInicial;
    }


}