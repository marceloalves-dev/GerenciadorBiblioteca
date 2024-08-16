package dominio;

import excecoes.ItemNaoEncontradoException;

public interface Gerenciavel {
    void adicionarItem(ItemBiblioteca itemBiblioteca);
    void removerItem(ItemBiblioteca itemBiblioteca) throws ItemNaoEncontradoException;
    ItemBiblioteca buscarItem(String titulo) throws ItemNaoEncontradoException;
}
