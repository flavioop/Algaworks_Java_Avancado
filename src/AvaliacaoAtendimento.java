import java.util.Scanner;

public class AvaliacaoAtendimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Avalie nosso atendimento (1 a 5): ");
        int nota = entrada.nextInt();

        String descricaoNota;

        switch (nota){
            case 1:
                descricaoNota = "Muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
            case 3:
                descricaoNota = "Razoável";
            case 4:
                descricaoNota = "Muito bom";
            case 5:
                descricaoNota = "Excelente";
            default:
                descricaoNota = "Opção Invalida";

        }

        System.out.println("Sua nota de atenditento: " + descricaoNota);


    }
}
