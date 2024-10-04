package Modules;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//criando a classe Postagem com seus atributos
public class Postagem {
    private String conteudo;
    private LocalDateTime data;
    private Usuario usuario;
    private boolean isDestacado;

    //Iniciando o construtor da classe
    public Postagem(String conteudo, Usuario usuario, boolean isDestacado) {
        this.conteudo = conteudo;
        this.data = LocalDateTime.now();
        this.usuario = usuario;
        this.isDestacado = isDestacado;
    }


    //metodo que exibe as postagens dos usuarios
    public void exibirPostagem() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String tipoPostagem = isDestacado ? "Destacado" : "Normal";
        System.out.println("Postagem (" + tipoPostagem + "):");
        System.out.println("Data: " + data.format(formatter));
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("------------------------");
        System.out.println("Usuário: ");
        usuario.exibirInformacoes();
    }
}
