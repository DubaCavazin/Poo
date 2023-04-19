package lista05.ex07;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo = true;
    private Date dataAtualizacao = new Date();
    private Date dataCadastro = new Date();

    public Pessoa(String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCadastro) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = ativo;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCadastro = dataCadastro;
        
    }

    
}
