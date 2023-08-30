package desafioAula;

public class ManipulaVetor {
    public int[] vetor;
    public int tamanho;

    public ManipulaVetor(int tamanho){
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
    }

    public void adicionaElemento(int indice, int valor) throws MinhaExcessao{
        if(indice < 0 || indice > this.tamanho){
            throw new MinhaExcessao(MensagemUtil.ERRO_INDICE_VETOR);
        }else{
            this.vetor[indice] = valor;
        }
    }
}
