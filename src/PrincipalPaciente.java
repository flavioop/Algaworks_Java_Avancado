public class PrincipalPaciente {

    public static void main(String[] args) {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();

        double peso = 175;
        double altura = 1.82;

        IndMassaCorporal imc = calculadoraIMC.calcular(peso,altura);

        if (imc.estaComObesidade()){
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "está com obesidade%n", imc.altura, imc.peso);
        }


        System.out.printf("IMC: %.2f%n", imc.resultado);

    }

}