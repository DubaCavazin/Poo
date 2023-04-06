package lista04.ex19;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Eduardo");
        pessoa.setIdade(22);
        pessoa.setCpf("123.456.789-00");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
    }
}
