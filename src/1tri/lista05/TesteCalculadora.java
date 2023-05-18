package lista05;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 2);
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());

        CalculadoraCientifica calcCient = new CalculadoraCientifica(10, 2);
        System.out.println("Potência: " + calcCient.potencia());
        System.out.println("Raiz: " + calcCient.raiz());
        System.out.println("Logaritmo: " + calcCient.logaritmo());
    }
    
}
