import java.util.Scanner;

public class ExameVitaminaD {
    public static void main(String[] args) {
//Desejavel: acima de 20 ng/Ml
//Grupo de risco: 30 a 60 ng/Ml

        Scanner entrada = new Scanner(System.in);
        System.out.print("Grupo de risco: ");
        boolean grupoDeRisco = entrada.nextBoolean();

        System.out.print("Vitamina D: ");
        double vitaminaD = entrada.nextDouble(); //nanograma por mililitro

        boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20)
                || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

        System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);
    }
}
