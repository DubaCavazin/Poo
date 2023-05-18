package lista01;

public class Ponteiro extends Jogador {

    private int numCamisa;
    
    public Ponteiro(int numCamisa, String nome, int idClube, int idade) {
        super(nome, idClube, idade);
        this.numCamisa = numCamisa;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("ID: " + getIdClube());
        System.out.println("Número da camisa: " + getNumCamisa());
    }


    public int getNumCamisa() {
        return this.numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdClube() {
        return this.idClube;
    }

    public void setIdClube(int idClube) {
        this.idClube = idClube;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
