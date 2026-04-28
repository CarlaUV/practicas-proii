package ejercicio3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import ejercicio3.*;

public class testVagon {
    @Test
    public void testConstructorYGetters() {
        Vagon v1 = new Vagon("A Coruña");
        Vagon v2 = new Vagon("Pontevedra");
        Vagon v3 = new Vagon("Lugo");
        Vagon v4 = new Vagon("Ourense");

        Tren tren = new Tren(1000);

        tren.setPrimerVagon(v1);
        v1.setSiguiente(v2);
        v2.setSiguiente(v3);
        v3.setSiguiente(v4);

        assertEquals(4, tren.getNumVagones());

        String[] esperados = {"A Coruña", "Pontevedra", "Lugo", "Ourense"};
        Vagon actual = tren.getPrimerVagon();
        for (String esperado : esperados) {
            assertNotNull(actual);
            assertEquals(esperado, actual.getNombre());
            actual = actual.getSiguiente();
        }
        assertNull(actual);
    }
}
