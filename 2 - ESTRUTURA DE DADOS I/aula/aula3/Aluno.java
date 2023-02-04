package estruturaDados1.aula3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno aluno) {
        int ordenacaoNome = this.nome.compareTo(aluno.nome);
        if (ordenacaoNome != 0) {
            return ordenacaoNome;
        }

        return 0;
    }
}
