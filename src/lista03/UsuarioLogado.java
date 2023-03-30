package lista03;

public class UsuarioLogado {
    static int qtdUsuarios = 0;
    String nomeUsuario;

    public UsuarioLogado(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        qtdUsuarios++;
    }

    public static void main(String[] args) {

        UsuarioLogado usuario1 = new UsuarioLogado("Eduardo");
        UsuarioLogado usuario2 = new UsuarioLogado("Renato");
        UsuarioLogado usuario3 = new UsuarioLogado("Carla");
        UsuarioLogado usuario4 = new UsuarioLogado("Vitor");
        UsuarioLogado usuario5 = new UsuarioLogado("Rafael");

        System.out.println("Usuarios Logados:");
        System.out.println("Usuario 1: " + usuario1.nomeUsuario);
        System.out.println("Usuario 2: " + usuario2.nomeUsuario);
        System.out.println("Usuario 3: " + usuario3.nomeUsuario);
        System.out.println("Usuario 4: " + usuario4.nomeUsuario);
        System.out.println("Usuario 5: " + usuario5.nomeUsuario);

        System.out.println("Quantidade de usuarios logados: " + qtdUsuarios);
        
    }
    
    
}

