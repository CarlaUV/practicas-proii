package proii.ejercicio2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String rutaFichero;
        Path fichero = null;
        OperadorFichero operadorFichero = null;
        
        try {
            while(operadorFichero == null) {
                try {
                    System.out.println("Indica la ruta al fichero a operar: ");

                    rutaFichero = entrada.nextLine();
                    fichero = Path.of(rutaFichero);
                    operadorFichero = new OperadorFichero(fichero);
                } catch(IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage() + "Por favor intentelo otra vez.");
                }
            }

            System.out.println("Contenidos del fichero: " + fichero);
        
            System.out.println(operadorFichero.leerFichero());
        
            String linea = null;
            do {
                System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
                linea = entrada.nextLine().trim();
                if (linea.length() > 0) {
                    operadorFichero.añadirTexto(linea + "\n");
                    System.out.println("Línea añadida");
                }
            } while (linea.length() > 0);
        
            System.out.println("Contenidos del fichero: " + fichero);
            System.out.println(operadorFichero.leerFichero());
        } catch(AccessDeniedException e) {
            System.out.println("Error. ACCESO DENEGADO AL FICHERO " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Error de ENTRADA / SALIDA " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Que tengas un buen día");
        }
    }
}