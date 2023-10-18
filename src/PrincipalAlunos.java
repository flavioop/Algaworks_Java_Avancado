import javax.swing.text.StyledEditorKit;

public class PrincipalAlunos {

    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        turmaB.alunos = new Aluno[4];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 10;

        turmaB.alunos[1] = new Aluno();
        turmaB.alunos[1].nome = "Ana";
        turmaB.alunos[1].idade = 5;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmaB.alunos[2] = aluno1;

        turmaB.imprimirListadeAlunos();
        /*for (int i = 0; i < turmaB.alunos.length;i++){
           if (turmaB.alunos[i] != null) {
               System.out.printf("%d - %s (%d anos)%n", i, turmaB.alunos[i].nome, turmaB.alunos[i].idade);
           }else{
               System.out.printf("%d - vago%n", i);
           }
        }*/

    }
}