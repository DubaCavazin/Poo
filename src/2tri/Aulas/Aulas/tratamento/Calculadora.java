package Aulas.tratamento;

public class Calculadora {
    
    public static double divisao(double a, double b) throws MinhaExcecao{
        if(b == 0){
            throw new MinhaExcecao(MensagemUtil.ERRO_DIVISAO);
        }
        return a / b;
    }
        
}

