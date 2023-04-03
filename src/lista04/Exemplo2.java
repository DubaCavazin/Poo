package lista04;

public class Exemplo2 {
    /*"static" é usado para declarar um atributo ou método como pertencente a classe e não a um objeto, já
    "this" é usado para referenciar um atributo ou método de um objeto.
     */
    int valor;

    Exemplo2(int valor) {
        this.valor = valor;
    }

    void naoEstatico() {
        System.out.println("Valor: " + valor);
    }

    static void estatico(Exemplo2 obj) {
        obj.estatico(obj);
    }


}
