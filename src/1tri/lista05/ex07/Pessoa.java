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

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    
}
