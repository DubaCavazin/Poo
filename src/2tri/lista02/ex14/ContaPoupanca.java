package lista02.ex14;

public class ContaPoupanca extends Conta {
    private int meses;
    private double taxaJuros;

    public ContaPoupanca(double saldo, int meses) {
        this.saldo = saldo;
        this.meses = meses;
        this.taxaJuros = taxaJuros = 0.05;
    }
    

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void getSaldo() {
        System.out.println(saldo);
    }
    

    @Override
    public void calcularSaldo() {
        double rendimento = saldo * taxaJuros * meses;
        saldo += rendimento;
    }
    
}
