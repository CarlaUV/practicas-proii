package ejercicio2;

import ejercicio1.Autor;

public class Libro extends Publicacion{ 
    private final String editorial;
    private final String lugar;

    public Libro(String titulo, int anho, int numCitas, Autor primerAutor,
            String editorial, String lugar) {
        super(titulo, anho, numCitas, primerAutor);
        this.editorial = editorial;
        this.lugar = lugar;
    }

    public String getEditorial() {
        return editorial;
    }
    public String getLugar() {
        return lugar;
    }

    @Override
    public double getIndice() {
        return super.getIndice()*0.8;
    }

    @Override
    public String toString() {
        return """
        Libro
            Titulo = %s
            Año Publicación = %d
            Editorial = %s
            Lugar = %s
        """.formatted(getTitulo(), getAnho(), getEditorial(), getLugar());
    }
}
