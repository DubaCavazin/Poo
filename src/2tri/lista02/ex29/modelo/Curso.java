package lista02.ex29.modelo;

public class Curso {
    private String nome;
    private String dataCriacao;
    private String periodo;
        
    public Curso() {
    }

    public Curso(String nome, String dataCriacao, String periodo) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.periodo = periodo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
   
}
