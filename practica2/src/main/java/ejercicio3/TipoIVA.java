package ejercicio3;

public enum TipoIVA {
    GENERAL(0.21),
    REDUCIDO(0.10),
    SUPERREDUCIDO(0.04),
    EXENTO(0.0),
    ARTISTICO(0.8);

    private final double porcentaje;

    TipoIVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double calcularPrecioFinal(double precioBase) {
        return precioBase * (1.0 + getPorcentaje());
    }
}
