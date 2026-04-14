package ejercicio2;

public class Publicacion {
    private final String titulo;
    private final int anho;
    
    public Publicacion(String titulo, int anho) {
        if(titulo.isBlank() || titulo == null) throw new IllegalArgumentException("El titulo no puede estar vacío");
        this.titulo = titulo;
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnho() {
        return anho;
    }

    @Override
    public String toString() {
        return """
            Título = %s
            Año = %s
        """.formatted(getTitulo(), getAnho());
    }
}
