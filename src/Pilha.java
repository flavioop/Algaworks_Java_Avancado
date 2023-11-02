import java.util.Arrays;

public class Pilha {

    static final int CAPACIDADE_INICIA_PADRAO = 4;

    Cliente[] elementos = new Cliente[CAPACIDADE_INICIA_PADRAO];
    int tamanho = 0;

    void adicionar(Cliente elemento){
        garantirCapacidade();
        elementos[tamanho++] = elemento;

    }

    Cliente retirar(){
        if(tamanho == 0){
            return  null;

        }
        //return elementos[--tamanho];
        Cliente elemento = elementos[--tamanho];
        elementos[tamanho] = null;
        return elemento;
    }

    void imprimirEstatisticas(){
        System.out.printf("Tamanho atual: %d%n", tamanho);
        System.out.printf("Capacidade: %d%n%n", elementos.length);
    }

    private void garantirCapacidade() {
        if (elementos.length == tamanho) {
            elementos = Arrays.copyOf(elementos, tamanho + 10);
        }
    }
}