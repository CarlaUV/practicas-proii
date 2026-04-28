package ejercicio4;

public class PaginasIncorretasException extends RuntimeException {
    public PaginasIncorretasException(int paginaInicial, int paginaFinal) {
        super("La página inicial %d no puede ser superior a la página final %d".formatted(paginaInicial, paginaFinal));
    }
}
