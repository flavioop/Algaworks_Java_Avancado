import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {


        String nome;
        double valorPorHora;
        int horasTrabalhadas;
        double valorDescontos;
        double totalDevido;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        nome = entrada.next();

        System.out.print("Informe a quantidade de horas: ");
        horasTrabalhadas = entrada.nextInt();

        System.out.print("Informe o valor da hora: ");
        valorPorHora = entrada.nextDouble();

        System.out.print("Informe o valor dos descontos: ");
        valorDescontos = entrada.nextDouble();

        totalDevido =  (horasTrabalhadas * valorPorHora) - valorDescontos ;

        System.out.println("Folha de pagamento: " + nome);
        System.out.println("Total de horas: " + horasTrabalhadas);
        System.out.println("Total descontos: " + valorDescontos);
        System.out.printf("Total devido: %10.2f%n", totalDevido);






    }

}
