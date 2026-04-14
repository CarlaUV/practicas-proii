package ejercicio1;

public class Autor {
    private final String orcid;
    private final String apellidos;
    private final String nombre;
    private final String institucion;

    public Autor(String orcid, String nombre, String apellidos, String institucion) {
        this.orcid = orcid;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.institucion = institucion;
    }

    public Autor(String orcid, String nombre, String apellidos) {
        this(orcid, apellidos, nombre, "Universidad de Vigo");
    }

    public String getOrcid() {
        return orcid;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public String getInstitucion() {
        return institucion;
    }

    @Override
    public String toString() {
        return """
            Autor {orcid = %s, nombre = %s, %s, institución = %s}
                """.formatted(getOrcid(), getNombre(), getApellidos(), getInstitucion());
    }
}
