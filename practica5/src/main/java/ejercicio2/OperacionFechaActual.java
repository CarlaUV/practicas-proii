package ejercicio2;

public class OperacionFechaActual implements Operacion {

    @Override
    public String getDescription() {
        return "¿Qué día es hoy?";
    }

    @Override
    public void ejecutar() {
        System.out.println("Hoy es: " + java.time.LocalDate.now());
    }
}