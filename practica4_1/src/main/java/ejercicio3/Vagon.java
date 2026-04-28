package ejercicio3;

public class Vagon {
    private final String nombre;
    private Vagon siguiente;
    private Vagon anterior;


    public Vagon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public Vagon getSiguiente() {
        return siguiente;
    }
    public Vagon getAnterior() {
        return anterior;
    }

    public void setSiguiente(Vagon nuevoSiguiente) {
        Vagon viejoSiguiente = this.siguiente;
        if (viejoSiguiente != null)
            viejoSiguiente.anterior = null;
        if (nuevoSiguiente != null)  {
            if (nuevoSiguiente.anterior != null)
                nuevoSiguiente.anterior.siguiente = null;
            nuevoSiguiente.anterior = this;
        }
        this.siguiente = nuevoSiguiente;     
    }

    public int cuantosMeSiguenA() {
        int count = 0;
        Vagon actual = this.getSiguiente();
        while(actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    public int cuantosMeSiguenB() {
        return this.siguiente == null ? 0 : 1 + this.siguiente.cuantosMeSiguenB();
    }
}
