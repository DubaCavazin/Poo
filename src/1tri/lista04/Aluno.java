package lista04;

public class Aluno {
   private String nome;
    private int idade;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, int idade, String matricula, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma/notas.length;
    }
}
