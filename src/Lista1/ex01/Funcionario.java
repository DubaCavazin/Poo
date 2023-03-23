package Lista1.ex01;

public class Funcionario {
    double salarioBase;
    double totalDeVendas;
    double salarioFinal;

    public Funcionario(double salarioBase, double totalDeVendas) {
        this.salarioBase = salarioBase;
        this.totalDeVendas = totalDeVendas;
        
        double comissao;

        if(totalDeVendas <= 0){
            comissao = 0;
        }
        else if(totalDeVendas <= 1000){
            comissao = totalDeVendas * 0.1;
        }
        else if(totalDeVendas <= 2000){
            comissao = totalDeVendas * 0.15;
        }
        else{   
            comissao = totalDeVendas * 0.2;
        }
    
        if(comissao <= 0){
            salarioFinal = salarioBase;
        }
        else{
            salarioFinal = salarioBase + comissao;
        }
    }

    public void imprimirSalario(){
        System.out.println("Salário base: R$"+ salarioBase);
        System.out.println("Total de vendas: R$"+ totalDeVendas);
        System.out.println("Salário final: R$"+ salarioFinal);
    }

}
