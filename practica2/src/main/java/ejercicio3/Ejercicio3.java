package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {     
        Articulo a = new Articulo("Memoria USB 64 GB", 10,TipoIVA.ARTISTICO); 
        System.out.println(a);
        System.out.println(new Articulo("Memoria USB 64 GB", 10,TipoIVA.GENERAL));
        
        System.out.println(TipoIVA.REDUCIDO.calcularPrecioFinal(2000));
    }
}
