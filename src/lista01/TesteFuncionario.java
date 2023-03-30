package lista01;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBase, totalDeVendas;
        
        System.out.println("Digite o salário base do funcionário: ");
        salarioBase = input.nextDouble();
        System.out.println("Digite o total de vendas do funcionário: ");
        totalDeVendas = input.nextDouble();
        
        Funcionario funcionario = new Funcionario(salarioBase, totalDeVendas);
        funcionario.imprimirSalario();
    }

    
}
