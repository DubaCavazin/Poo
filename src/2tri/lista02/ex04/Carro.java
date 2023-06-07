package lista02.ex04;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 0;
    }

    public Carro(String marca){
        this.marca = marca;
        this.modelo = "";
        this.ano = 0;
    }
    
}
