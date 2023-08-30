package desafioAula;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int tamanho;
        int indice;
        int valor;
        
        System.out.println("Informe o tamanho do vetor: ");
        tamanho = tc.nextInt();
        
        ManipulaVetor novoVetor = new ManipulaVetor(tamanho);

        System.out.println("Informe o valor a ser adicionado: ");
        valor = tc.nextInt();
        System.out.println("Infome o índice que deseja adicionar o valor: ");
        indice = tc.nextInt();

        try{
            novoVetor.adicionaElemento(indice, valor);
        }catch(MinhaExcessao e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
