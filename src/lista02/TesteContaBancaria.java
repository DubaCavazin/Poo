package lista02;
import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        String nomeTitular;
        int numeroConta;
        double saldo;
        
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        nomeTitular = tc.nextLine();
        System.out.print("Digite o número da conta: ");
        numeroConta = tc.nextInt();
        System.out.print("Digite o saldo: ");
        saldo = tc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nomeTitular, numeroConta, saldo);
        conta.imprimirDados();
        
    }
}
