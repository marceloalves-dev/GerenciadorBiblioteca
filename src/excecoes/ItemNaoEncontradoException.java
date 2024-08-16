package excecoes;

public class ItemNaoEncontradoException extends Exception {
    public ItemNaoEncontradoException() {
        super("item nao encontrado");
    }

    public ItemNaoEncontradoException(String message) {
        super(message);
    }
}
