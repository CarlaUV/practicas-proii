package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import ejercicio1.Hora;
import ejercicio1.Fecha;
import ejercicio2.*;

public class testReunion {
    @Test
    public void testEliminarSecretario() {
        Hora hora = new Hora(12,5);
        Fecha fecha = new Fecha(7,4,2026);
        Empleado empelado = new Empleado("correo@gmail.com", "empleado");
        Empleado secretario = new Empleado("secretario@gmail.com", "secretario");
        Reunion reunion = new Reunion(fecha, hora, "proii","Ourense", empelado, secretario);
        Empleado e3 = new Empleado("noel@gmail.com", "noel");
        reunion.agregarEmpleado(e3);

        int pos = -1;
        for (int i = 0; i < reunion.numEmpelados(); i++) {
            if(reunion.getEmpleado(pos) == secretario) {
                pos = i;
                break;
            }
        }
        final int poSecretario = pos;
        assertThrows(IllegalArgumentException.class, () -> reunion.eliminarEmpleado(poSecretario));
    }
}
