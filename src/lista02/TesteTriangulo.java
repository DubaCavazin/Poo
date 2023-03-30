package lista02;
import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        
        System.out.println("Digite o lado A do triangulo: ");
        ladoA = tc.nextInt();
        System.out.println("Digite o lado B do triangulo: ");
        ladoB = tc.nextInt();
        System.out.println("Digite o lado C do triangulo: ");
        ladoC = tc.nextInt();
        
        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        
        System.out.println("Tipo do triangulo: " + triangulo.tipoTriangulo);
    }
    
}
