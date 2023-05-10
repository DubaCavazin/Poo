package av1;

final public class PJuridica extends Pessoa {

    private String cnpj;
    private String email;
    private String telefone;



    public PJuridica(String nome, int id, String cnpj, String email, String telefone) {
        this.nome = super.nome;
        this.id = super.id;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
