public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;



    void alterarPrecoCusto(Double precoCusto){
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;

    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }

}