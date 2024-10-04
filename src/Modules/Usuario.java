package Modules;

import java.util.ArrayList;
import java.util.List;

//Criando a classe Usuario com seus atributos
public class Usuario {

    // Declaração de atributos da classe 'Usuario'
    protected String nome;
    protected String email;
    protected int idade;
    protected String senha;


    // Construtor da classe 'Usuario'.
    // Esse construtor é chamado quando um objeto 'Usuario' é criado.
    // Ele inicializa os atributos da classe com os valores passados como argumentos.
    public Usuario(String nome, String email, int idade, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
    }

    // Esse metodo exibe as informações do usuario na tela
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }
}
