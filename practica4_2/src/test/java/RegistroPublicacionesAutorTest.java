import org.junit.jupiter.api.Test;

import ejercicio1.Autor;
import ejercicio2.Articulo;

public class RegistroPublicacionesAutorTest {
    @Test
    public void probarLibro() {
        Autor autor = new Autor("1", "Pérez", "Pepe", "Insitucion");
        Articulo miArticulo = new Articulo("nombre", 12, 1, 25, "", 0, 0, autor);
        
    }
}
