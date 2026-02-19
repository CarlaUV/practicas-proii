package ejercicio5;

public enum Operacion {
    SUMAR,
    RESTAR,
    MULTIPLICAR,
    DIVIDIR;

    public double calcular(double n1, double n2) {
        return switch (this) {
            case SUMAR -> n1+n2;
            case RESTAR -> n1-n2;
            case MULTIPLICAR -> n1*n2;
            case DIVIDIR -> (n2==0) ? Double.NaN: n1/n2;
        };
    }
}
