import java.util.Scanner;

public class AnoBissextos {

    public static void main(String[] args) {

        int anoDigitado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um ano");
        anoDigitado = entrada.nextInt();

        boolean anoBissexto = anoDigitado % 400 == 0 || (anoDigitado % 4 == 0 && anoDigitado % 100 != 0);

        System.out.printf("Bissexto: %b%n", anoBissexto);

    }

}
