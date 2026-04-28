package ejercicio2;

import ejercicio1.Autor;

public class ComunicacionEnCongreso extends Publicacion{
    private final String nombreCongreso;
    private final String ciudad;
    private final String pais;

    public ComunicacionEnCongreso(String institucion, String titulo, int numCitas, Autor primerAutor,
            int anho, String nombreCongreso, String ciudad, String pais) {
        super(titulo, anho, numCitas, primerAutor);
        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombreCongreso() {
        return nombreCongreso;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getPais() {
        return pais;
    }
    @Override
    public double getIndice() {
        return super.getIndice()*0.6;
    }

    @Override
    public String toString() {
        return """
            Comunicación en Congreso
            %s
            Nombre de Congreso = %s
            Ciudad = %s
            País = %s
        """.formatted(super.toString(), getNombreCongreso(), getCiudad(), getPais());
    }
}
