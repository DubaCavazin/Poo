package lista02.ex29.modelo;

public class Estudante extends Pessoa {
    private String cpf;

    public Estudante() {
    }

    public Estudante(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}

