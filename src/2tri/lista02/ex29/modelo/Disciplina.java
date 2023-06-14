package lista02.ex29.modelo;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int ano;
    private Professor professor;
    private Curso curso;

    public Disciplina() {
    }

    public Disciplina(String nome, int cargaHoraria, int ano, Professor professor, Curso curso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ano = ano;
        this.professor = professor;
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
