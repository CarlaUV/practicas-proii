package proii.ejercicio1;

import java.util.Scanner;

public class Division {
    public static int divide(int a, int b) {
        if(b == 0)
            throw new IllegalArgumentException("El divisor no puede ser 0");
        return a / b;
    }
    
    private static int leerEntero(Scanner sc, String mensaje) {
        int retorno = 0;
        boolean error = true;
        while(error) {
            System.out.println("\n"+mensaje);
            try {
                retorno = Integer.parseInt(sc.nextLine());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("El divisor no puede ser cero");
            } catch(ArithmeticException e) {
                System.out.println("El divisor no puede ser 0");
            } catch(IllegalArgumentException e) {
                System.out.println("Argumento ilegal");
            }
        }
        return retorno;
    }

    public static void main (String[] args) {
        int num1;
        int num2;
        Scanner scan = new Scanner( System.in );
    
        num1 = leerEntero(scan, "\nIntroduzca divisor: " );
        num2 = leerEntero(scan, "\nIntroduzca divisor: " );
    
        System.out.println( "\nEl resultado es: " + divide( num1, num2 ) );

        scan.close();
    }
}
