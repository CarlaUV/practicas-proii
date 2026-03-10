package ejercicio4;

import org.junit.jupiter.api.Test;

import proii.ejercicio4.Categoria;
import proii.ejercicio4.Deportista;

public class DeportistaTest {
    @Test
    public void testCrearDeportistaValidarBenjamin() {
        Deportista d1 = new Deportista("a544a6","bebé",1);
        assertEquals(Categoria.BENJAMIN, d1.getCategoria());
    }

    @Test
    public void testControlarMayorDeEdad() {
        Deportista d1 = new Deportista("2", "Mayor de edad", 18);
        assertTrue(d1.esMayorDeEdad());
    }

    @Test
    public void testSetEdadNegativaLanzaExcecion() {
        Deportista d1 = new Deportista("2", "Mayor de edad", 18);
        assertThrows(IllegalArgumentException.class, () -> d1.setEdad(-18));
    }
}