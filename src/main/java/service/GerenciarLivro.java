package service;

import model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLivro{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public void cadastrarLivros(){
        Livro livro = new Livro();

        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        while (titulo.isBlank()) {
            System.out.println("Titulo não pode ficar em branco");
            System.out.println("Titulo: ");
            titulo = scanner.nextLine();
        }
        livro.setTitulo(titulo);

        System.out.println("Autor: ");
        String autor = scanner.nextLine();
        while (autor.isBlank()){
            System.out.println("Autor não pode ficar em branco");
            System.out.println("Autor: ");
            autor = scanner.nextLine();
        }
        livro.setAutor(autor);


        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        while (isbn.isBlank() || isbn.length() != 13 || !isbn.matches("[0-9]+")) {
            if (isbn.isBlank()) {
                System.out.println("ISBN não pode ficar em branco");
            }
            if (isbn.length() != 13) {
                System.out.println("ISBN precisa ter 13 caracetes");
            }
            if (!isbn.matches("[0-9]+")){
                System.out.println("ISBN deve conter apenas numeros");
            }
            System.out.println("ISBN: ");
            isbn = scanner.nextLine();
        }
        livro.setIsbn(isbn);



        System.out.println("Ano: ");
        String anoTexto = scanner.nextLine();
        while (anoTexto.isBlank()
                || !anoTexto.matches("[0-9]+")
                || Integer.parseInt(anoTexto) > LocalDate.now().getYear()) {
            if (anoTexto.isBlank()) {
                System.out.println("Ano não pode ficar em branco");
            } else if (!anoTexto.matches("[0-9]+")) {
                System.out.println("Ano tem que ser numérico");
            } else if (Integer.parseInt(anoTexto) > LocalDate.now().getYear()) {
                System.out.println("Ano não pode ser maior que o ano atual");
            }
            System.out.println("Ano: ");
            anoTexto = scanner.nextLine();
        }
        int ano = Integer.parseInt(anoTexto);
        livro.setAno(ano);

        System.out.println("Quantidade: ");
        String quantidadeExemplaresTexto = scanner.nextLine();
        while (quantidadeExemplaresTexto.isBlank()
                || !quantidadeExemplaresTexto.matches("[0-9]+")
        ){
            if (quantidadeExemplaresTexto.isBlank()){
                System.out.println("Quantidade de exemplares não pode estar vazio");
            }
            if (!quantidadeExemplaresTexto.matches("[0-9]+")){
                System.out.println("Quantidade de exemplares tem que ser numérico");
            }
            System.out.println("Quantidade exemplares: ");
            quantidadeExemplaresTexto = scanner.nextLine();
        }
        int quantidadeExemplares = Integer.parseInt(quantidadeExemplaresTexto);
        livro.setQuantidadeExemplares(quantidadeExemplares);
        livros.add(livro);
    }
}
