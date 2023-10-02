import java.util.Scanner;
public class ControlePesoAeronave {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Peso máximo da aeronave");
            int pesoMaximo = entrada.nextInt();


            int pesoTotalPassageiro = 0;


            while (true){
                System.out.printf("Peso do passageiro: ");
                int pesoPassageiro = entrada.nextInt();

                if(pesoTotalPassageiro + pesoPassageiro > pesoMaximo){
                    System.out.println("Passageiro não incluido, peso máximo atingido");
                    continue;
                }
                pesoTotalPassageiro += pesoPassageiro;

                System.out.println("Incluir novo passageiro? ");
              if(!entrada.nextBoolean()){
                  break;
              }

            }

            System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
            System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiro);
            System.out.printf("Situal da aeronave: %s%n", pesoTotalPassageiro > pesoMaximo ? "peso excedido" : "liberada");
        }
    }





