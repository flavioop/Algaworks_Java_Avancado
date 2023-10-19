import java.util.ArrayList;

public class ArrayCollectionsAPI {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

        for (String aluno :alunos) {
            System.out.println(aluno);
        }


        //for (int i = 0; i < alunos.size(); i++){
          //  String aluno = alunos.get(i);
           // System.out.println(i);
            //System.out.println(aluno);

        //}

    }


}