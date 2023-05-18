package lista04;

public class Exemplo {
    String nome;

    //Referência ao objeto:
    Exemplo(String nome) {
        this.nome = nome;
    }
    void imprimir () {
        System.out.println("Nome: " + nome);
    }

    //Referência ao construtor:
    Exemplo() {
        this("Sem nome");
    }
    
}
