package lista01;

abstract public class Jogador {

    protected String nome;
    protected int idClube;
    protected int idade;

    public Jogador(String nome, int idClube, int idade) {
        this.nome = nome;
        this.idClube = idClube;
        this.idade = idade;
    }


    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdClube() {
        return this.idClube;
    }

    protected void setIdClube(int idClube) {
        this.idClube = idClube;
    }

    protected int getIdade() {
        return this.idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

}
