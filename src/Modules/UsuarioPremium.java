package Modules;


public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome, String email, int idade, String senha) {
        super(nome, email, idade, senha);
    }

    public boolean isPremium() {
        return true;
    }
}
