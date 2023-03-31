package br.ifpr.aula.pacotes;

public class Teste {
    public static void main(String[] args) {
        JogadorVolei duba = new JogadorVolei();

        //String corCabelo = duba.getCorCabelo();//Erro pois o método é private
        duba.setCorCabelo("Preto");
        
    }
    
}
