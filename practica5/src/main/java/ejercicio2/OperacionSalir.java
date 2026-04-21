package ejercicio2;

public class OperacionSalir implements Operacion {

    public String getDescription() {
        return "Salir";
    }

    public void ejecutar() {
        System.out.println("¡Hasta luego!");
    }
}