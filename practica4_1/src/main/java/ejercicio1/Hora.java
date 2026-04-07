package ejercicio1;

public class Hora {
    private final int hora;
    private final int minuto;
 
    public Hora(int hora, int minuto) {
        if(hora < 0 || hora > 23)
            throw new IllegalArgumentException("La hora solo puede estar entre 0 y 23");
        if(minuto < 0 || minuto > 59)
            throw new IllegalArgumentException("Los minutos solo pueden estar entre 0 y 59");
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "&d:&d".formatted(hora, minuto);
    }
}
