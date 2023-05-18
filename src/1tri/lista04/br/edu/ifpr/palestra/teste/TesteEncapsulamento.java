package lista04.br.edu.ifpr.palestra.teste;

import java.util.Date;

import lista04.br.edu.ifpr.palestra.modelo.Certificado;
import lista04.br.edu.ifpr.palestra.modelo.Palestra;
import lista04.br.edu.ifpr.palestra.modelo.Palestrante;
import lista04.br.edu.ifpr.palestra.modelo.Sala;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.capacidade = 50;
        sala.local = "IFPR Campus Curitiba";
        sala.nome = "Sala 102";
        
        Palestrante palestrante = new Palestrante();
        palestrante.nome = "João da Silva";
        palestrante.cpf = "123.456.789-00";
        palestrante.endereco = "Rua das Flores, 123";
        palestrante.rg = "987654321";
        palestrante.dataNascimento = new Date();
        palestrante.ciadeNascimento = "Curitiba";
        palestrante.estadoNascimento = "PR";
        
        Palestra palestra = new Palestra();
        palestra.tema = "Orientação a objetos";
        palestra.diaHora = new Date();
        palestra.exieFrequencia = true;
        
        Certificado certificado = new Certificado();
        certificado.livro = 1;
        certificado.folha = 10;
        certificado.pagina = 5;
        certificado.numeroDoCetificado = 123;
    }

    /*A alteração da visibilidade dos atributos e métodos das classes pode levar a erros de compilação, problemas
    de manutenção e de segurança. Por exemplo, se o atributo capacidade da classe Sala for declarado como private,
    o código não compilará, pois a classe TesteEncapsulamento não terá acesso ao atributo.
     */

    
}
