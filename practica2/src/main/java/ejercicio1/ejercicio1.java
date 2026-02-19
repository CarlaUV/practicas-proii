package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Libro libro = new Libro("titulo","autor","editorial1",2005,"A13209NKGD");
        System.out.println(libro);
    }

    static Libro crearLibroDesdeConsola(Scanner scanner){

        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce los autores: ");
        String autores = scanner.nextLine();

        System.out.print("Introduce la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Introduce el año de edición: ");
        int anho = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.nextLine();


        return new Libro(titulo, autores, editorial, anho, isbn);
    }

    static TipoLibro leeTipoLibro(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Tipo de libro:");
            for (int i = 0; i < TipoLibro.values().length; i++) {
                System.out.println((i+1) + ".-" + TipoLibro.values()[i]);
            }
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println("Opción incorrecta");
        }while(opcion < 1 || opcion > TipoLibro.values().length);
        return (TipoLibro.values()[opcion-1]);
    }
}

