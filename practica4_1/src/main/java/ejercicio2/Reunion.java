package ejercicio2;

import java.util.ArrayList;

import ejercicio1.Fecha;
import ejercicio1.Hora;

public class Reunion {
    private Fecha fecha;
    private Hora hora;
    private String asunto;
    private String lugar;
    private ArrayList<Empleado> asistentes;
    private Empleado secretario;
    
    public Reunion(Fecha fecha, Hora hora, String asunto, String lugar, Empleado asistente, Empleado secretario) {
        asistentes = new ArrayList<Empleado>();
        asistentes.add(secretario);
        asistentes.add(asistente);
        this.fecha = fecha;
        this.hora = hora;
        this.asunto = asunto;
        this.lugar = lugar;
        this.secretario = secretario;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Empleado getSecretario() {
        return secretario;
    }

    public void setSecretario(Empleado secretario) {
        this.secretario = secretario;
    }

    public void agregarEmpleado(Empleado empleado) {
        asistentes.add(empleado);
    }
    public void eliminarEmpleado(int pos) {
        if(asistentes.get(pos) == secretario)
            throw new IllegalArgumentException("Error. No se puede eliminar al secretario de la reunión.");
        if(asistentes.size() == 2)
            throw new IllegalArgumentException("Error. La reunión tiene que tener como mínimo 2 asistentes.");
        asistentes.remove(pos);
    }
    public Empleado getEmpleado(int pos) {
        return asistentes.get(pos);
    }
    public int numEmpelados() {
        return asistentes.size();
    }
}
