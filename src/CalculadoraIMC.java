public class CalculadoraIMC {

    double peso;
    double altura;

    IndMassaCorporal calcular(){

        IndMassaCorporal imc = new IndMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;

    }




}