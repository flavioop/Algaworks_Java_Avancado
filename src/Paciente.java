public class Paciente {

    double peso;
    double altura;

    IndMassaCorporal calcularIndiceMassaCorporal(){

        IndMassaCorporal imc = new IndMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;

    }



}