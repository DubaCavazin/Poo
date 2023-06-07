package lista02.ex27;

public class NumPrimos {
    public int n;
    
    public int somaDosNumerosPrimosDeUmAteN(int n){
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (ehPrimo(i)) {
                soma += i;
                System.out.println(soma);
            }
        }
        return soma;
    }

    public boolean ehPrimo(int n){
        if (n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        NumPrimos np = new NumPrimos();
        System.out.println(np.somaDosNumerosPrimosDeUmAteN(10));
    }
}
