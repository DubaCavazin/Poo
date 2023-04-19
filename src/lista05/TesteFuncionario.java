package lista05;
import ls05.Diretor;
public class TesteFuncionario {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João", "123.456.789-00", 160, 1000);
        System.out.println("Salário do diretor: " + diretor.calcularSalario());

        Engenheiro engenheiro = new Engenheiro("Maria", "987.654.321-00", 160, 1000);
        System.out.println("Salário do engenheiro: " + engenheiro.calcularSalario());

        Secretario secretario = new Secretario("Renato", "321.123.321-99", 80, 160);
        System.out.println("Salário do secretário: " + secretario.calcularSalario());
    }
}
