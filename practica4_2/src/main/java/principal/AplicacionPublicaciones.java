 
package principal;

import java.util.ArrayList;

import ejercicio1.*;
import ejercicio2.*;

public class AplicacionPublicaciones {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("Galiciencia", 15, 0, 45, "", 0);
        ComunicacionEnCongreso congreso = new ComunicacionEnCongreso("","", 0, "", "Ourense", "");
        Libro libro = new Libro("Apuntes de clase", 2026, "Galaxia", "Vigo");

        System.out.println("__________");
        System.out.println(articulo);
        System.out.println("__________");
        System.out.println(libro);
        System.out.println("__________");
        System.out.println(congreso);
        System.out.println("__________");

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(libro);
        publicaciones.add(congreso);
        publicaciones.add(articulo);

        for (Publicacion p : publicaciones) {
            System.out.println(p);
        }

        // downcasting and upcasting
        Publicacion p = new Libro("Nueva publicación", 2026, "ediotrial 1", "uvigo");
        
        for (Publicacion publicacion : publicaciones) {
            if(p instanceof Libro) {
                Libro lib = (Libro) publicacion;
                System.out.println(lib.getEditorial());
            }
        }
    }
}