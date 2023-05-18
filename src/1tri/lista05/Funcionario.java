package lista05;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected int horasTotais;

    public Funcionario(String nome, String cpf, int horasTotais) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTotais = horasTotais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getHorasTotais() {
        return horasTotais;
    }

    public void setHorasTotais(int horasTotais) {
        this.horasTotais = horasTotais;
    }

    
}
