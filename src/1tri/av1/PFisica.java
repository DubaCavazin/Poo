package av1;

final public class PFisica extends Pessoa {
    
    private String cpf;
    private String email;
    private String telefone;


    public PFisica (String nome, int id, String cpf, String email, String telefone) {
        super.nome = nome;
        super.id = id;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("Nome: " + super.nome);
        System.out.println("ID: " + super.id);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }    

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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