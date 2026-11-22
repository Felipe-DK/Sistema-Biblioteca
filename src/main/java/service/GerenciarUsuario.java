package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarUsuario {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void cadastrarUsuario() {
        Usuario usuario = new Usuario();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        while (nome.isBlank()) {
            System.out.println("Nome deve ser obrigatorio!");
            System.out.println("Nome: ");
            nome = scanner.nextLine();
        }
        Usuario.setNome(nome);

        System.out.println("Email: ");
        String email = scanner.nextLine();
        while (email.isBlank() || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            if (email.isBlank()) {
                System.out.println("Email deve ser obrigatorio!");
            } else if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                System.out.println("Formato de e-mail invalido");
            }
            System.out.println("Email: ");
            email = scanner.nextLine();
        }
        usuario.setEmail(email);


        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }
}