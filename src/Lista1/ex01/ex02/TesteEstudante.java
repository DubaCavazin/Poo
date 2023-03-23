package Lista1.ex01.ex02;
import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Notas Estudante 1:");
        System.out.println("Digite a nota um:");
        double notaUmE1 = teclado.nextDouble();
        System.out.println("Digite a nota dois:");
        double notaDoisE1 = teclado.nextDouble();
        System.out.println(" ");
        
        System.out.println("Notas Estudante 2:");
        System.out.println("Digite a nota um:");
        double notaUmE2 = teclado.nextDouble();
        System.out.println("Digite a nota dois:");
        double notaDoisE2 = teclado.nextDouble();
        System.out.println("");
        
        System.out.println("Média Estudante 1:");
        Estudante e1 = new Estudante(notaUmE1, notaDoisE1);
        e1.imprimirMedia();
        System.out.println("");

        System.out.println("Média Estudante 2:");
        Estudante e2 = new Estudante(notaUmE2, notaDoisE2);
        e2.imprimirMedia();
    }
    
}
