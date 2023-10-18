import java.util.Arrays;

public class RemovendoElementosArrays {
    public static void main(String[] args) {
        int [] numerosJogoAtual = {25,11,8,46,37,14,55};
        int [] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

        int indiceExclusao = 3;
        //Copiando de um array para outro, pulando um dos elementos, terceiro elemento do primeiro Array
        System.arraycopy(numerosJogoAtual,0,numerosNovoJogo,0,indiceExclusao);
        System.arraycopy(numerosJogoAtual,indiceExclusao + 1,numerosNovoJogo,indiceExclusao,numerosNovoJogo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogo));
    }
}