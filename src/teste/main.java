package teste;

import dominio.*;
import excecoes.ItemNaoDisponivelException;
import excecoes.ItemNaoEncontradoException;

public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        ItemBiblioteca livro1 = new Livro("Biblia", "Deus");
        ItemBiblioteca livro2 = new Livro("gastronomia", "jaccin");
        ItemBiblioteca midiaDigital1 = new MidiaDigital("ebook", "marcelo");
        ItemBiblioteca periodo1 = new Periodico("periodo", "tiago");

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(midiaDigital1);
        biblioteca.adicionarItem(periodo1);

        try {
            biblioteca.removerItem(livro2);
            ItemBiblioteca aux1 = biblioteca.buscarItem(livro1.getTitulo());
            ItemBiblioteca aux2 = biblioteca.buscarItem("ebook");

            System.out.println(aux1.getTitulo());
            System.out.println(aux2.getTitulo());

            livro1.emprestar();
            System.out.println(livro1.isDisponivel());
            livro1.devolver();
            System.out.println(livro1.isDisponivel());

        } catch (ItemNaoEncontradoException | ItemNaoDisponivelException e) {
            e.printStackTrace();
        }


    }
}
