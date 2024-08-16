package dominio;

import excecoes.ItemNaoDisponivelException;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected boolean disponivel = true;

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public abstract void emprestar() throws ItemNaoDisponivelException;

    public abstract void devolver();

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
