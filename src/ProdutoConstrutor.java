import java.util.Objects;
import java.util.UUID;

public class ProdutoConstrutor {

    String nome;
    final String codigo;
    static final int QUANTIDADE_INICAL_ESTOQUE = 80;
    int quantidaEstoque;

    ProdutoConstrutor(){
        this("sem nome");
    }

    /*ProdutoConstrutor(){
        this.nome = "sem nome";
        this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;
    }*/

    ProdutoConstrutor(String nome ){
       this(nome, QUANTIDADE_INICAL_ESTOQUE);

        /*Objects.requireNonNull(nome, "Nome é obrigatório");
       this.nome = nome;
       this.quantidaEstoque = QUANTIDADE_INICAL_ESTOQUE;*/

    }


    ProdutoConstrutor(String nome, int estoqueInicial ){
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque Inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidaEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();
    }


}