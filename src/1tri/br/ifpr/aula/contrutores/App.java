package br.ifpr.aula.contrutores;
public class App {
    public static void main(String[] args) throws Exception {
        Alunos duba = new Alunos();
        Alunos tata = new Alunos("000.000.000-00");
        Alunos rere = new Alunos("111.111.111-11");
        Alunos carla = new Alunos("222.222.222-22");

        System.out.println("Quantidade Estático: " + duba.qtdAlunos);
        System.out.println("Quantidade Atributo: " + duba.qtdAtributo);

        System.out.println(Alunos.qtdAlunos);

    }
}
