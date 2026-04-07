package ejercicio2;

public class Empleado {
    private String correo;
    private String nombre;

    public Empleado(String correo, String nombre) {
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String nombre) {
        this.correo = nombre;
    }
    public void setNombre(String apellidos) {
        this.nombre = apellidos;
    }
}
