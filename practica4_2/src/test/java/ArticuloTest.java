import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio1.*;
import ejercicio2.*;

public class ArticuloTest {
    @Test
    public void testConstructorYTodosLosGetters() {
        Articulo articuloTest = new Articulo("Voge", 2,1,25, "Titulo", 2026);

        assertEquals("Titulo", articuloTest.getTitulo());
        assertEquals("Voge", articuloTest.getNombreRevista());
        assertEquals(2, articuloTest.getVolumen());
        assertEquals(1, articuloTest.getPaginaInicial());
        assertEquals(25, articuloTest.getPaginaFinal());
    }
}