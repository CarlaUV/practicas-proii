package ejercicio1;

public class Reunion {
    private Fecha fecha;
    private Hora hora;
    private String asunto;
    private String lugar;

    public Reunion(String asunto, int dia, int mes, int anho, int hora, int minuto, String lugar) {
        this.fecha = new Fecha(dia, mes, anho);
        this.hora = new Hora(hora, minuto);
        this.asunto = asunto;
        this.lugar = lugar;
    }
    
    public Fecha getFecha() {
        return new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnho());
    }
    public Hora getHora() {
        return new Hora(hora.getHora(), hora.getMinuto());
    }
    public String getAsunto() {
        return asunto;
    }
    public String getLugar() {
        return lugar;
    }

    public void setFecha(int anho, int mes, int dia) {
        this.fecha = new Fecha(dia, mes, anho);
    }
    public void setHora(int hora, int minuto) {
        this.hora = new Hora(hora, minuto);
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getHora() + " " + getFecha();
    }
}
