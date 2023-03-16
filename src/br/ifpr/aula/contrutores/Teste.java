package br.ifpr.aula.contrutores;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Aumento de Salário
        System.out.println("Digite o  salario: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o percentual de aumento: ");
        double percentual = sc.nextDouble();
        System.out.println("O novo salario é: R$" + salarioAtual(salario, percentual));
        

        // de dados
        tipoDados();
        

        //Soma até n
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("A soma de 1 até " + n + " é: " + somaAte(n));
        

        //Calculo de idade
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println(calculoIdade(nome, dia, mes, ano));
        

        //Disciplinas do 2º ano
        discEnSoftware();
        
    }

    static double salarioAtual(double salario, double percentual) {
        return salario + (salario * percentual / 100);
    }

    static void tipoDados(){
        System.out.println("Tipos de dados: ");
        System.out.println("byte");
        System.out.println("short");
        System.out.println("int");
        System.out.println("long");
        System.out.println("float");
        System.out.println("double");
        System.out.println("char");
        System.out.println("boolean");

    }
    
    static int somaAte(int n){
        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }

    static String calculoIdade (String nome, int dia, int mes, int ano){
        int diaRef = 15;
        int mesRef = 3;
        int anoRef = 2023;

        int idade = anoRef - ano;
        
        if(mesRef < mes){
            idade--;
        } else if(mesRef == mes){
            if(diaRef < dia){
                idade--;
            }
        }

        return ("No dia 15/03/203, "+ nome + " tem " + idade + " anos.");
    }

    static void discEnSoftware (){
        System.out.println("Disciplinas do 2º ano:");
        System.out.println("Banco de Dados II");
        System.out.println("Projeto Integrador I");
        System.out.println("Análise de Projeto e Sistemas");
        System.out.println("Programação Orientada a Objetos");
        System.out.println("Cálcuco");
        System.out.println("Algoritmos e Estruturs de Dados");
        System.out.println("Interação Humano-Computador");
        System.out.println("Arquitetura de Computadores");
        System.out.println("Empreendedorismo");
    }
}
