import javax.swing.text.StyledEditorKit;

public class PrincipalAlunos {

    public static void main(String[] args) {
        Turma turmaB = new Turma();

        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.idade = 8;

        Aluno aluno3 = new Aluno();
        aluno2.nome = "José";
        aluno2.idade = 13;


        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno2);

        turmaB.removerAluno(1);

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