package desafioAula;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int tamanho, indice, valor, x;

        System.out.println("Informe o tamanho do vetor: ");
        tamanho = tc.nextInt();

        ManipulaVetor novoVetor = new ManipulaVetor(tamanho);

        x = 0;
        do{
            

            System.out.println("Informe o valor a ser adicionado: ");
            valor = tc.nextInt();
            System.out.println("Infome o índice que deseja adicionar o valor: ");
            indice = tc.nextInt();

            try{
                novoVetor.adicionaElemento(indice, valor);
            }catch(MinhaExcessao e){
                System.out.println(e.getMessage());
            }

            System.out.println("Para sair digite 1: ");
            x = tc.nextInt();
            System.out.println("-------------------------");
        }while(x != 1);

        for(int i = 0; i < tamanho; i++){
            System.out.println("Vetor[" + i + "] = " + novoVetor.vetor[i]);
        }
        
        tc.close();
    }
    
}
