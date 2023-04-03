package lista04;

public class Livro {
   String titulo;
    String autor;
    
    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibeDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}
