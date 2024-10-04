import Modules.Postagem;
import Modules.Usuario;
import Modules.UsuarioPremium;


public class Main {
    public static void main(String[] args) {

        //Instancia um usuario do tipo Usuario, com nome, email, idade e senha.
        Usuario usuario = new Usuario("bruce", "bruce@teste.com", 24, "*****");

        //Instancia um usuario do tipo UsuarioPremium.
        UsuarioPremium usuarioPremium = new UsuarioPremium("wendel", "wendel@teste.com.br" , 30, "****");

        //Instancia o Metodo de postagem com conteudo, usuario e se é desatacado ou nao.
        Postagem postagem = new Postagem("me da um 10!!!", usuario,  false);

        //instancia o metodo de postagem de usuario Premium.
        Postagem postagemPremium = new Postagem("this user has MORAL", usuarioPremium,  true);

        //chama o metodo para exibir a postagem do usuario normal
        postagem.exibirPostagem();

        //chama o metodo para exibir a postagem do usuario Premium
        postagemPremium.exibirPostagem();

    }
}

