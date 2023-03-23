package Lista1.ex01.ex02;

public class Estudante {
    double notaUm;
    double notaDois;
    double media;

    public Estudante(double notaUm, double notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.media = (notaUm + notaDois) / 2;
    }

    public void imprimirMedia(){
        System.out.println("Nota um: "+ notaUm);
        System.out.println("Nota dois: "+ notaDois);
        System.out.println("Média: "+ media);

    }
}
