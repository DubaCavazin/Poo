package lista02;

public class Produto {
    int codigo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;

    public Produto(int codigo, String descricao, double precoUnitario, int qtdEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.qtdEstoque = qtdEstoque;
    }

    public double calcularValorEstoque(){
        return this.precoUnitario * this.qtdEstoque;
    }

    public void adicionarEstoque(int qtd){
        this.qtdEstoque += qtd;
    }

    public void removerEstoque(int qtd){
        this.qtdEstoque -= qtd;
    }

}
