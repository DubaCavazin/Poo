package lista04;

public class App {
    public static void main(String[] args) {
        imprimir();
    }

    static void imprimir(){
        String teste = "Oi";
        System.out.println(teste);
    }
    
}
/*
 * Não é possível imprimir o método imprimir() pois ao retirar o "static" do método
 * imprimir() o método não é mais estático, e para ser chamado deve ser instanciado
 * um objeto da classe App.
 */

