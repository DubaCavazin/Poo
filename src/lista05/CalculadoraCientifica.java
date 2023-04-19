package lista05;
import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {
    public CalculadoraCientifica(double valor1, double valor2) {
        super(valor1, valor2);
    }

    public double potencia() {
        return Math.pow(getValor1(), getValor2());
    }

    public double raiz() {
        return Math.pow(getValor1(), 1 / getValor2());
    }

    public double logaritmo() {
        return Math.log(getValor1()) / Math.log(getValor2());
    }
    
}
