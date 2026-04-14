package ejercicio2;

public class Libro extends Publicacion{ 
    private final String editorial;
    private final String lugar;

    public Libro(String titulo, int anho,
            String editorial, String lugar) {
        super(titulo, anho);
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
