package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(500);
        System.out.println(c1);

        c1.retirar(200);
        System.out.println(c1);
        System.out.println(Cuenta.getSaldoTotalBanco());
    }
}
