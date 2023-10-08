public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Thiago Faria";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "888.999.999-44";
        voce.anoNascimento = 1981;


        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = voce;
        meuCarro.precoCompra = 120000;

        double valorRevenda = meuCarro.calcularValorRevenda();
        System.out.printf("Tempo de uso (anos): %d%n", meuCarro.anoFabricacao);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);





        /*System.out.println(meuCarro.calcularValorRevenda());*/


        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;
        seuCarro.precoCompra = 98000;
        /*seuCarro.calcularValorRevenda();*/


        /*System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
        System.out.printf("Ano: %s%n", meuCarro.proprietario.nome);

        System.out.println("================================================================================");

        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);
        System.out.printf("Ano: %s%n", seuCarro.proprietario.nome);*/



    }
}