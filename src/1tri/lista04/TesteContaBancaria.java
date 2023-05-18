package lista04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000, 1000);

        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(100);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.sacar(500);
        System.out.println("Saldo: " + conta.getSaldo());

    }
}
