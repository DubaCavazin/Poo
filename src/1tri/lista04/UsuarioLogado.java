package lista04;

public class UsuarioLogado {
    static int contadorLogados = 0;
    String nome;

    public UsuarioLogado(String nomeUsuario) {
        this.nome = nomeUsuario;
        contadorLogados++;
    }

    public static void main(String[] args) {

        UsuarioLogado usuario1 = new UsuarioLogado("Eduardo");
        UsuarioLogado usuario2 = new UsuarioLogado("Renato");
        UsuarioLogado usuario3 = new UsuarioLogado("Carla");
        UsuarioLogado usuario4 = new UsuarioLogado("Vitor");
        UsuarioLogado usuario5 = new UsuarioLogado("Rafael");

        System.out.println("Usuarios Logados:");
        System.out.println("Usuario 1: " + usuario1.nome);
        System.out.println("Usuario 2: " + usuario2.nome);
        System.out.println("Usuario 3: " + usuario3.nome);
        System.out.println("Usuario 4: " + usuario4.nome);
        System.out.println("Usuario 5: " + usuario5.nome);

        System.out.println("Quantidade de usuarios logados: " + contadorLogados);
        
    }

    /*Os atributos "nome" são diferentes para cada objeto, mas o atributo "contadorLogados" é o 
    mesmo para todos os objetos, pois ele é estático, ou seja, compartilhado em todas as instancias
    da classe.
    O uso de atributos estáticos é recomendado quando o valor de um atributo é compartilhado por
    todas as instancias da classe, como é o caso do contador de usuarios logados.
     */
    
}
