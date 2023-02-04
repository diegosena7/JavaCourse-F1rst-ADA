package estruturaDados1.aula3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenar {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("Letícia", "Samila", "Michele", "Camila"));
        lista.sort((a, b) -> a.compareTo(b));
        System.out.println(lista);
        lista.sort((a, b) -> b.compareTo(a));
        System.out.println(lista);

        List<Aluno> alunos = new ArrayList<>(List.of(
                new Aluno("Jeronimo", "3424"),
                new Aluno("Davi", "2133"),
                new Aluno("Pedro", "4587"),
                new Aluno("Diego", "8965"),
                new Aluno("Diego", "9087"),
                new Aluno("Roberta", "4321"),
                new Aluno("Pedro", "2143")
        ));

        alunos.sort((a, b) -> a.compareTo(b));
        System.out.println(alunos);

        // Comparator<Aluno> alunoComparator = Comparator.comparing((a, b) -> a.getNome().compareTo());
    }
}