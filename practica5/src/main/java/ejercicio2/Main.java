package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Operacion> operaciones = new ArrayList<>();
        operaciones.add(new OperacionSaludar());
        operaciones.add(new OperacionFechaActual());
        operaciones.add(new OperacionSalir());
        Programa programa = new Programa(operaciones);
        programa.iniciar();
    }
}
