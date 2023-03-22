package br.ifpr.aula.contrutores;

public class Pessoa {
    String nome;
    int anoNascimento;
    String idade;

    public Pessoa(String nome, int anoNascimento){
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.log();
    }

    public void log(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Idade: " + idade);
    }
}
