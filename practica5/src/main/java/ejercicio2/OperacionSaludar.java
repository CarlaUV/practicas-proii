package ejercicio2;

public class OperacionSaludar implements Operacion {

    public String getDescription() {
        return "Saludar";
    }

    public void ejecutar() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }
}