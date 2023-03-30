package lista02;

public class Triangulo {
    int ladoA;
    int ladoB;
    int ladoC;
    String tipoTriangulo;
    
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            if (ladoA == ladoB && ladoB == ladoC) {
                this.tipoTriangulo = "Valido-Equilatero";
            } 
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                this.tipoTriangulo = "Valido-Isosceles";
            } 
            else {
                this.tipoTriangulo = "Valido-Escaleno";
            }
        } else {
            this.tipoTriangulo = "Invalido";
        }
    }
}
