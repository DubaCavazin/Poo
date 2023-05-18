package lista01.teste;

import lista01.Levantador;
import lista01.Ponteiro;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        Levantador lev[] = new Levantador[200];
        Ponteiro pon[] = new Ponteiro[200];

        int qtdLev = 0;
        int qtdPon = 0;
        boolean cont = true;

        while(cont){
            System.out.println("--------------------------");
            System.out.println("1 - Cadastrar Levantador");
            System.out.println("2 - Cadastrar Ponteiro");
            System.out.println("3 - Listar Levantadores");
            System.out.println("4 - Listar Ponteiros");
            System.out.println("5 - Excluir Levantador");
            System.out.println("6 - Excluir Ponteiro");
            System.out.println("7 - Sair");
            System.out.println("--------------------------");
            System.out.print("Digite a opção desejada: ");
            int op = tc.nextInt();

            if(op == 1){
                System.out.println("Digite o nome do Levantador: ");
                String nome = tc.next();
                tc.nextLine();
                System.out.println("Digite o ID do clube: ");
                int idClube = tc.nextInt();
                tc.nextLine();
                System.out.println("Digite a idade do levantador: ");
                int idade = tc.nextInt();
                tc.nextLine();
                System.out.println("Digite o número da camisa: ");
                int numCamisa = tc.nextInt();
                tc.nextLine();
                lev[qtdLev] = new Levantador(numCamisa, nome, idClube, idade);
                qtdLev++;
            }
            else if(op == 2){
                System.out.println("Digite o nome do Ponteiro: ");
                String nome = tc.next();
                tc.nextLine();
                System.out.println("Digite o ID do clube: ");
                int idClube = tc.nextInt();
                tc.nextLine();
                System.out.println("Digite a idade do levantador: ");
                int idade = tc.nextInt();
                tc.nextLine();
                System.out.println("Digite o número da camisa: ");
                int numCamisa = tc.nextInt();
                tc.nextLine();
                pon[qtdPon] = new Ponteiro(numCamisa, nome, idClube, idade);
                qtdPon++;
            }
            else if(op == 3){
                for(int i = 0; i < qtdLev; i++){
                    lev[i].imprimir();
                }
            }
            else if(op == 4){
                for(int i = 0; i < qtdPon; i++){
                    pon[i].imprimir();
                }
            }
            else if(op == 5){
                System.out.println("Digite o ID do clube do Levantador que deseja excluir: ");
                int idClube = tc.nextInt();
                tc.nextLine();
                for(int i = 0; i < qtdLev; i++){
                    if(lev[i].getIdClube() == idClube){
                        lev[i] = null;
                        for(int j = i; j < qtdLev; j++){
                            lev[j] = lev[j+1];
                        }
                        qtdLev--;
                    }
                }
            }
            else if(op == 6){
                System.out.println("Digite o ID do clube do Ponteiro que deseja excluir: ");
                int idClube = tc.nextInt();
                tc.nextLine();
                for(int i = 0; i < qtdPon; i++){
                    if(pon[i].getIdClube() == idClube){
                        pon[i] = null;
                        for(int j = i; j < qtdPon; j++){
                            pon[j] = pon[j+1];
                        }
                        qtdPon--;
                    }
                }
            }
            else if(op == 7){
                cont = false;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        tc.close();
    }
}
