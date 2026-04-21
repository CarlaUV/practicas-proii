package ejercicio2;
import java.util.List;
import java.util.Scanner;

public class Programa {
    private List<Operacion> operaciones;

    private Scanner scanner = new Scanner(System.in);

    public Programa(List<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú ---");

        for (int i = 0; i < operaciones.size(); i++) {
            System.out.println((i+1) + ". " + operaciones.get(i).getDescription());
        }

        System.out.println("Elige una opción: ");
    }

    public void iniciar() {
        int opcion = 0;

        while (opcion != operaciones.size()) {
            mostrarMenu();
            opcion = leerEntero();
            if(opcion < 1 && opcion > operaciones.size()) {
                System.out.println("Opción incorrecta");
            } else operaciones.get(opcion-1).ejecutar();
        }

        scanner.close();
    }

    private int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, introduce un número: ");
            }
        }
    }
}