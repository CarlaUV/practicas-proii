import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio2.Articulo;
import ejercicio2.Publicacion;

public class PublicacionTest {
    @Test
    public void testConstructorYTodosLosGetters() {
        Publicacion articuloTest = new Publicacion("Titulo", 2026);

        assertEquals("Titulo", articuloTest.getTitulo());
        assertEquals(2026, articuloTest.getAnho());
    }
}
