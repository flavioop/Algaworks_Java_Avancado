public class CalculadoraIMC {

    IndMassaCorporal calcular(Paciente paciente){

        IndMassaCorporal imc = new IndMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;

    }




}