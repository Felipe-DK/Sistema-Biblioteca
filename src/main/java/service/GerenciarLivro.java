package service;

import model.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLivro{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public void cadastrarLivros(){
        Livro livro = new Livro();

        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        livro.setTitulo(titulo);

        System.out.println("Autor: ");
        String autor = scanner.nextLine();
        livro.setAutor(autor);

        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        livro.setIsbn(isbn);

        System.out.println("Ano: ");
        int ano = scanner.nextInt();
        livro.setAno(ano);

        System.out.println("Quantidade: ");
        int quantidadeExemplares = scanner.nextInt();
        livro.setQuantidadeExemplares(quantidadeExemplares);

        livros.add(livro);


    }
}
