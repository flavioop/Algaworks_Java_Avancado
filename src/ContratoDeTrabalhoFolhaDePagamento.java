public class ContratoDeTrabalhoFolhaDePagamento {

    FuncionariosFolhaPagamento funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }



}