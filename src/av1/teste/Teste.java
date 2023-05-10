package av1.teste;

import av1.PFisica;
import av1.PJuridica;
import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        //Teste para saber se tudo funciona
        Scanner tc = new Scanner(System.in);

        PFisica pf[] = new PFisica[200];
        PJuridica pj[] = new PJuridica[200];

        int qtdPF = 0;
        int qtdPJ = 0;
        boolean cont = true;

        while(cont){
            System.out.println("--------------------------");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar Pessoas Físicas");
            System.out.println("4 - Listar Pessoas Jurídicas");
            System.out.println("5 - Sair");
            System.out.println("--------------------------");
            System.out.print("Digite a opção desejada: ");
            int op = tc.nextInt();

            if(op == 1){
                System.out.print("Digite o nome: ");
                String nome = tc.next();
                System.out.print("Digite o ID: ");
                int id = tc.nextInt();
                System.out.print("Digite o CPF: ");
                String cpf = tc.next();
                System.out.print("Digite o email: ");
                String email = tc.next();
                System.out.print("Digite o telefone: ");
                String telefone = tc.next();
                pf[qtdPF] = new PFisica(nome, id, cpf, email, telefone);
                qtdPF++;
            }
            else if(op == 2){
                System.out.print("Digite o nome: ");
                String nome = tc.next();
                System.out.print("Digite o ID: ");
                int id = tc.nextInt();
                System.out.print("Digite o CNPJ: ");
                String cnpj = tc.next();
                System.out.print("Digite o email: ");
                String email = tc.next();
                System.out.print("Digite o telefone: ");
                String telefone = tc.next();
                pj[qtdPJ] = new PJuridica(nome, id, cnpj, email, telefone);
                qtdPJ++;
            }
            else if(op == 3){
                for(int i = 0; i < qtdPF; i++){
                    pf[i].imprimir();
                }
            }
            else if(op == 4){
                for(int i = 0; i < qtdPJ; i++){
                    pj[i].imprimir();
                }
            }
            else if(op == 5){
                cont = false;
                System.out.println("Programa encerrado!");
            }
            else{
                System.out.println("Opção inválida!");
            }
        }

        
    }
    
}
