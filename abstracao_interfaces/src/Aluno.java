import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricularEm(Disciplina disciplina) {
        this.disciplinasMatriculadas.add(disciplina);
    }

    public String getNome() {
        return this.nome;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return this.disciplinasMatriculadas;
    }
}