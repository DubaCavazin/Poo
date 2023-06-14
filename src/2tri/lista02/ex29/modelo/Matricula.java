package lista02.ex29.modelo;

public class Matricula {
    private String ra;
    private String data;
    private Turma turma;
    private Estudante estudante;

    public Matricula() {
    }

    public Matricula(String ra, String data, Turma turma, Estudante estudante) {
        this.ra = ra;
        this.data = data;
        this.turma = turma;
        this.estudante = estudante;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }


}
