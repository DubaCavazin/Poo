package Aulas.tratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExessoes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int x = -1;

        do{
            try{
                System.out.println("Digite um numero: ");
                x = tc.nextInt();

                if(10 / x == 5){
                    System.out.println("Deu certo!");
                }

            }catch(InputMismatchException e1){
                System.out.println("Não é um Inteiro");
            }catch(ArithmeticException e2){
                System.out.println("Divisão por zero");
                System.out.println("Saindo do loop");
                break;
            }finally{
                tc.nextLine();
            }
        }while( x != 0);

        
    }
}
