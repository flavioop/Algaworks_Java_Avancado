public class CalculadoraIMC {

    IndMassaCorporal calcular(double peso, double altura){

        IndMassaCorporal imc = new IndMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;

    }




}