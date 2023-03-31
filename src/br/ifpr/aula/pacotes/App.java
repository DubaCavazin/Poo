package br.ifpr.aula.pacotes;

public class App {
    int x;
    public static void main(String[] args) {

        App table = new App();

        System.out.println(table.x);
        table.imprimir();
    }

    public void imprimir(){
        System.out.println(this.x);
    }
}
