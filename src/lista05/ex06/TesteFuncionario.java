package lista05.ex06;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "123456", "1234");
        System.out.println(f1.getNome());
        System.out.println(f1.getRg());
        System.out.println(f1.getCartao());
        f1.pertence();
        testePertenciemto(f1);

        Pessoa p1 = new Pessoa("Eduardo");

        Funcionario f2 = new Funcionario(p1.getNome(), "654321", "4321");
        System.out.println(f2.getNome());
        
    }

    public static void testePertenciemto(Object obj) {
        if (obj instanceof Pessoa) {
            System.out.println("O objeto é uma instância de Pessoa.");
        }
        if (obj instanceof PessoaFisica) {
            System.out.println("O objeto é uma instância de PessoaFisica.");
        }
        if (obj instanceof PessoaJuridica) {
            System.out.println("O objeto é uma instância de PessoaJuridica.");
        }
    }
}
