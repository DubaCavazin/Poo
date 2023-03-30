package br.ifpr.aula.contrutores;

public class Alunos {
    static int qtdAlunos = 0;
    int qtdAtributo = 0;
    String cpf;
    
    public Alunos(){
        this.cpf = "000.000.000-00";
        qtdAlunos++;
        this.qtdAtributo++;

    }
    public Alunos(String cpf){
        this.cpf = cpf;
        qtdAlunos++;
        this.qtdAtributo++;
    }
}
