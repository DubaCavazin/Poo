package ls05;

import lista05.Funcionario;

public class Diretor extends Funcionario{
    private double bonus;

    public Diretor(String nome, String cpf, int horasTotais, double bonus) {
        super(nome, cpf, horasTotais);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return (getBonus() + (horasTotais * 21));
    }


    
}
