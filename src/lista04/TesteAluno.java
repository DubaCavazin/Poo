package lista04;

public class TesteAluno {
    public static void main(String[] args) {
        double[] notas1 = { 10, 10, 10, 10 };

        Aluno aluno1 = new Aluno("Eduardo", 22, "123456", notas1);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Notas: " + aluno1.getNotas());
        System.out.println("Media: " + aluno1.calcularMedia());

        double[] notas2 = { 5, 5, 5, 5 };
        Aluno aluno2 = new Aluno("Vitor", 20, "654321", notas2);

        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matricula: " + aluno2.getMatricula());
        System.out.println("Notas: " + aluno2.getNotas());
        System.out.println("Media: " + aluno2.calcularMedia());
    }
}
