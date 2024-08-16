package dominio;

import excecoes.ItemNaoEncontradoException;

import java.util.ArrayList;

public class Biblioteca implements Gerenciavel {
    protected ArrayList<ItemBiblioteca> itemBibliotecas = new ArrayList<>();

    @Override
    public void adicionarItem(ItemBiblioteca itemBiblioteca) {
        itemBibliotecas.add(itemBiblioteca);
    }

    @Override
    public void removerItem(ItemBiblioteca itemBiblioteca) throws ItemNaoEncontradoException {
        if (!itemBibliotecas.contains(itemBiblioteca)) {
            throw new ItemNaoEncontradoException();
        }
        itemBibliotecas.remove(itemBiblioteca);
    }

    @Override
    public ItemBiblioteca buscarItem(String titulo) throws ItemNaoEncontradoException {
        for (ItemBiblioteca item : itemBibliotecas) {
            if (item.titulo.equals(titulo)) {
                return item;
            }
        }
        throw new ItemNaoEncontradoException();
    }
}
