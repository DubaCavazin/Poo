package lista02;
import java.util.Scanner;

public class TesteImovel {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String endereco;
        double valorVenal;
        
        System.out.println("Digite o endereco do imovel: ");
        endereco = tc.nextLine();
        System.out.println("Digite o valor venal do imovel: ");
        valorVenal = tc.nextDouble();
        
        Imovel imovel = new Imovel(endereco, valorVenal);
        
        imovel.imprimirDados();
    }
    
}
