package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        Operacion tipo = Operacion.SUMAR;

        System.out.println("Resultado: " + tipo.calcular(3,2));
        System.out.println(Operacion.DIVIDIR.calcular(10, 0));
    }
}
