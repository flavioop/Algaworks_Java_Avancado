public class PrincipalAeronave {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        //aviaoGol.ativo = false;
        aviaoGol.ativar();
        aviaoGol.reservaAssetos(10);

        System.out.printf("Gol (%s): %d assentos disponiveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;

        //aviaoGol.ativo = false;
        aviaoLatam.ativar();
        aviaoLatam.reservaAssetos(5);

        System.out.printf("LATAM (%s): %d assentos disponiveis%n", aviaoLatam.ativo ? "Ativo" : "Inativo", aviaoLatam.calcularAssentosDisponiveis());




    }
}