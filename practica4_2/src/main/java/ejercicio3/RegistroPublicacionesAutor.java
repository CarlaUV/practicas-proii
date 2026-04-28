package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import ejercicio1.Autor;
import ejercicio2.*;

public class RegistroPublicacionesAutor {
    private final Autor autor;
    private List<Publicacion> publicaciones;

    public RegistroPublicacionesAutor(Autor autor) {
        this.autor = autor;
        publicaciones = new ArrayList<>();
    }

    public Autor getAutor() {
        return autor;
    }
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void anhadirPublicacion(Publicacion nuevaPublicacion) {
        this.publicaciones.add(nuevaPublicacion);
    }
    public double calcularIndiceC() {
        double count = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Articulo)
                count += publicacion.getNumCitas();
            if (publicacion instanceof Libro)
                count += publicacion.getNumCitas()*0.8;
            if (publicacion instanceof ComunicacionEnCongreso)
                count += publicacion.getNumCitas()*0.6;
        }
        return count;
        //IndiceC = (NúmeroCitasArticulo * 1) + (NúmeroCitasLibro * 0.8) + (NúmeroCitasComunicacion * 0.6)
    }

    public double calcularIndicePolimorfismo() {
        double count = 0;
        for (Publicacion publicacion : publicaciones) {
            count += publicacion.getIndice();
        }
        return count;
    }
}
