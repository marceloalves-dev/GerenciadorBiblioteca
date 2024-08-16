package excecoes;

public class ItemNaoDisponivelException extends Exception {

    public ItemNaoDisponivelException() {
        super("item não disponivel");
    }

    public ItemNaoDisponivelException(String message) {
        super(message);
    }
}
