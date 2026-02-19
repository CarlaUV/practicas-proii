package ejercicio1;

public class Libro {
    String titulo;
    String autores;
    String editorial;
    int anho;
    String isbn;

    Libro(String titulo, String autores, String editorial, int anho, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anho = anho;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Título = %s\nAutores = %s\nEditorial = %s\nAño = %d\nIsbn = %s".formatted(titulo,autores,editorial,anho,isbn);
    }
}
