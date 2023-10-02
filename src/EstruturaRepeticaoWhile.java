import java.util.Scanner;

public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Peso máximo da aeronave");
    int pesoMaximo = entrada.nextInt();


    int pesoTotalPassageiro = 0;
    boolean incluirNovoPassageiro = true;

     while (pesoTotalPassageiro <= pesoMaximo && incluirNovoPassageiro){
        System.out.printf("Peso do passageiro: ");
        int pesoPassageiro = entrada.nextInt();

        pesoTotalPassageiro += pesoPassageiro;

        System.out.println("Incluir novo passageiro? ");
        incluirNovoPassageiro = entrada.nextBoolean();

    }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiro);
        System.out.printf("Situal da aeronave: %s%n", pesoTotalPassageiro > pesoMaximo ? "peso excedido" : "liberada");
}
}
