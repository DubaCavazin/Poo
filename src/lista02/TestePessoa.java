package lista02;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 50;
        Pessoa[] pessoas = new Pessoa[n];
        
        //Inserir dados
        for(int i = 0; i < 50; i++){
            System.out.println("Insira o dia do nascimento da " + (i+1) + "ª pessoa:");
            int dia = teclado.nextInt();
            System.out.println("Insira o mês de nascimento da " + (i+1) + "ª pessoa:");
            int mes = teclado.nextInt();
            System.out.println("Insira o ano de nascimento da " + (i+1) + "ª pessoa:");
            int ano = teclado.nextInt();

            pessoas[i] = new Pessoa(dia, mes, ano);
        }

        //Imprimir idade
        for(int i = 0; i < 50; i++){
            System.out.println("Idade da pessoa " + (i+1) + ": ");
            pessoas[i].imprimirIdade();
            System.out.println("--------------------");
        }
    }
    
}