package lista02.ex29.modelo;

public class Turma {
    private String nome;
    private int numMinimo;
    private int anoIngresso;
    private Curso curso;

    public Turma() {
    }
    
    public Turma(String nome, int numMinimo, int anoIngresso, Curso curso) {
        this.nome = nome;
        this.numMinimo = numMinimo;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumMinimo() {
        return this.numMinimo;
    }

    public void setNumMinimo(int numMinimo) {
        this.numMinimo = numMinimo;
    }

    public int getAnoIngresso() {
        return this.anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
}
