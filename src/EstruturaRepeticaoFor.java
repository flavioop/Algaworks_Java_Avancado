import java.util.Scanner;

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*for (int i = 1; i <= 10; i++){
           System.out.println(i);
       }

        for (int x = 10; x >= 0; x--){
            System.out.println(x);
        }*/

        System.out.println("Peso máximo da aeronave");
        int pesoMaximo = entrada.nextInt();

        System.out.println("Quantidade de passageiros");
        int totalPassageiros = entrada.nextInt();

        int pesoTotalPassageiro = 0;

        for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++){
            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiro += pesoPassageiro;
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiro);
        System.out.printf("Situal da aeronave: %s%n", pesoTotalPassageiro > pesoMaximo ? "peso excedido" : "liberada");



        System.out.println();



    }
}
