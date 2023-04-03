package lista04;

public class Triangulo {
    double altura;
    double largura;

    Triangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    double calcularArea() {
        double area = (this.altura * this.largura) / 2;
        return area;
    }
}
