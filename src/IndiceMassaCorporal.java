import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        double imc = peso / (altura * altura);

        System.out.printf("IMC de %s: %.2f%n", nome, imc);
    }
}
