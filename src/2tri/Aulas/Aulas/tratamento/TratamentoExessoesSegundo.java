package Aulas.tratamento;

public class TratamentoExessoesSegundo {
    
    public static void main(String[] args) throws MinhaExcecao {
        boolean carregando = true;
        
        Calculadora.divisao(10, 1);

        try{
            System.out.println(MensagemUtil.MAIN_BD);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            carregando = false;
        }

        System.out.println("Janela sendo exibida: " + carregando);
    }

}



