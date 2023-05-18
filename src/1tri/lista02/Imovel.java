package lista02;

public class Imovel {
    String endereco;
    double valorVenal;
    double valorVenda;

    public Imovel(String endereco, double valorVenal) {
        this.endereco = endereco;
        this.valorVenal = valorVenal;
        int taxaLucro = 15;

        this.valorVenda = this.valorVenal + (this.valorVenal * taxaLucro / 100);

    }

    public void imprimirDados(){
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Valor Venal: R$" + this.valorVenal);
        System.out.println("Valor Venda: R$" + this.valorVenda);
    }
}
