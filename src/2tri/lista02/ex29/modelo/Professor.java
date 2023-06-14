package lista02.ex29.modelo;

public class Professor extends Pessoa {
    private Disciplina disciplina;

    public Professor() {
    }

    public Professor(String nome, Disciplina disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
