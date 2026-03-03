package proii.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        boolean error = true;
        Cuenta c1 = new Cuenta(1000);
        Cuenta c2 = null;
        System.out.println(c1);

        while(error) {
            try {
                float inicial = Integer.parseInt(sc.nextLine());
                c2 = new Cuenta(inicial);
                error = false;
            }catch(NumberFormatException e) {
                System.out.println("Solo numerpos, por favor");
            }catch(IllegalArgumentException e) {
                System.out.println("La cantidad no puede ser negativa " + e.getMessage());
            }
        }
        System.out.println(c2);
        sc.close();
    }
}
