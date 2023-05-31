//1 - Somar vetor de inteiros
//2 - Somar qtd de parametros inteiros indeterminados
//3 - Soma de vetor de caracteres ascii
//4 - Soma de String com double
//5 - Somar dois vetores inteiros e retornar um vetor de inteiros com a soma

public class Sobrecarga{
    
    public static void main(String[] args) {
        int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
        char[] vetor2 = {'a','b','c'};
        int[] vetor3 = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor4 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(soma(vetor1));//Teste 1
        System.out.println(soma(1,2,3,4.5));//Teste 2
        System.out.println(soma(vetor2));//Teste 3
        System.out.println(soma("10", "10.5"));//Teste 4
        
        int[] vetor5 = soma(vetor3, vetor4);//Teste 5
        for(int i = 0; i < vetor5.length; i++){
            System.out.print(vetor5[i] + " ");
        }
        
    }

    //Soma de vetor de inteiros
    public static int soma(int[] vetor){
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }

    //Somar qtd de parametros double indeterminados
    public static double soma(double... numeros){
        double soma = 0;
        for(double numero : numeros){
            soma += numero;
        }
        return soma;
    }
    
    //Soma de vetor de caracteres ascii
    public static int soma(char[] vetor){
        int codigo = 0;
        for (int i = 0; i < vetor.length; i++) {
            codigo += (int) vetor[i];
        }
        return codigo;
    }

    //Soma de String com double
    public static double soma(String str, String str1){
        double a = Double.parseDouble(str);
        double b = Double.parseDouble(str1);

        return a + b;
    }

    //Somar dois vetores inteiros e retornar um vetor de inteiros com a soma
    public static int[] soma(int[] vetor1, int[] vetor2){
        int[] vetor3 = new int[vetor1.length];
        for(int i = 0; i < vetor1.length; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        return vetor3;
    }

}