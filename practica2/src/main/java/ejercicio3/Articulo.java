package ejercicio3;

public class Articulo {
    private String nombre; 
    private double precio; 
    private TipoIVA tipoIVA;
    
    public Articulo(String nombre, double precio, TipoIVA tipoIVA) {
        this.nombre = nombre;    
        this.precio = precio; 
        this.tipoIVA = tipoIVA; 
    }
    
    private double calcularPrecioFinal() {  
        return tipoIVA.calcularPrecioFinal(precio);
    }

    public String toString() { 
        return """
            Artículo: %s
            Precio final: %f euros
            IVA: %s
            """.formatted(nombre, calcularPrecioFinal(), tipoIVA.getPorcentaje());
    }
}