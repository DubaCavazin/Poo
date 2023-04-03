package lista04;

public class Conta {
    double saldo;
    static int numeroDeContas;

    Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        numeroDeContas++;
    }

    static int getNumeroDeContas() {
        return numeroDeContas;
    }
    
}
