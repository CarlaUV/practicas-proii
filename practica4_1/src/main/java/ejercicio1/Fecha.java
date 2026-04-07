package ejercicio1;

public class Fecha {
    private final int dia;
    private final int mes;
    private final int anho;

    public Fecha(int dia, int mes, int anho) {
        if(anho < 0) 
            throw new IllegalArgumentException("El año debe ser positivo");
        if(mes < 1 || mes > 12)
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12");
        if(dia < 1 || dia > diasDelMes(mes, anho))
            throw new IllegalArgumentException("El día es incorrecto");
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnho() {
        return anho;
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    private int diasDelMes(int mes, int anio) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> esBisiesto(anio) ? 29 : 28;
            default -> throw new IllegalArgumentException("Mes inválido: " + mes);
        };
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "&d/&d/&d".formatted(dia, mes, anho);
    }
}
