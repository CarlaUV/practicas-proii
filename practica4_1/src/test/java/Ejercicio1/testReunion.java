package Ejercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio1.Reunion;
import ejercicio1.Hora;
import ejercicio1.Fecha;

public class testReunion {
    @Test
    public void testConstructorYGetters() {
        Reunion reunion = new Reunion("proii", 25, 5, 2026, 2, 15, "Ourense");
        assertEquals("proii", reunion.getAsunto());
        assertEquals("Ourense", reunion.getLugar());
        Hora h = reunion.getHora();
        assertEquals(15, h.getMinuto());
        assertEquals(2, h.getHora());
        Fecha f = reunion.getFecha();
        assertEquals(25, f.getDia());
        assertEquals(5, f.getMes());
        assertEquals(2026, f.getAnho());
    }
}
