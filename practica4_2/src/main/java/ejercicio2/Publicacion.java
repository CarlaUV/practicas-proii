package ejercicio2;

import ejercicio1.Autor;

public class Publicacion {
    private final String titulo;
    private final int anho;
    private final int numCitas;
    private final Autor primerAutor;
    private double indice;
    
    public Publicacion(String titulo, int anho, int numCitas, Autor primerAutor) {
        if(titulo.isBlank() || titulo == null) throw new IllegalArgumentException("El titulo no puede estar vacío");
        this.titulo = titulo;
        this.anho = anho;
        this.numCitas = numCitas;
        this.primerAutor = primerAutor;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnho() {
        return anho;
    }
    public int getNumCitas() {
        return numCitas;
    }
    public Autor getPrimerAutor() {
        return primerAutor;
    }
    public double getIndice() {
        return indice;
    }
    
    @Override
    public String toString() {
        return """
            Título = %s
            Año = %s
        """.formatted(getTitulo(), getAnho());
    }
}
