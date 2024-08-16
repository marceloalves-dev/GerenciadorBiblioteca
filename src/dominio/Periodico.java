package dominio;

import excecoes.ItemNaoDisponivelException;

public class Periodico extends ItemBiblioteca {

    public Periodico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void emprestar() throws ItemNaoDisponivelException {
        if (!disponivel) {
            throw new ItemNaoDisponivelException();
        }
        disponivel = false;
    }

    @Override
    public void devolver() {
        disponivel = true;
    }
}
