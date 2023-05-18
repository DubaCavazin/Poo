package lista03;
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        double x, y;
        
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = tc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y = tc.nextDouble();

        System.out.println("Soma:" + Calculadora.soma(x,y));
        System.out.println("Subtracao:" + Calculadora.subtracao(x,y));
        System.out.println("Multiplicacao:" + Calculadora.multiplicacao(x,y));
        System.out.println("Divisao:" + Calculadora.divisao(x,y));
    }




    
}
