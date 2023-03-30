package lista02;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

//classe
public class Pessoa {
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;

    public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    
        Date date = new Date();
    
        // LocalDate localDate = LocalDate.now();
        LocalDate localDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    
        int ano = localDate.getYear();
        int mes = localDate.getMonthValue();
        int dia = localDate.getDayOfMonth();
    
        idade = ano - anoNascimento;
    
        if(mes < mesNascimento) {
            idade--;
        } else if(mes == mesNascimento) {
            if(dia < diaNascimento) {
                idade--;
            }
        }
    }

    public void imprimirIdade(){
        System.out.println(idade + " anos");
        
    }
    
}