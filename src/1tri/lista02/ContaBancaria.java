package lista02;

public class ContaBancaria {
    String nomeTitular;
    int numeroConta;
    double saldo;
    int taxaDeJuros;

    public ContaBancaria(String nomeTitular, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

        if(saldo < 1000.00){
            this.taxaDeJuros = 5;
        } else if(saldo < 50000.00){
            this.taxaDeJuros = 10;
        } else{
            this.taxaDeJuros = 15;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void imprimirDados(){
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Taxa de juros: " + this.taxaDeJuros + "%");
    }
}
