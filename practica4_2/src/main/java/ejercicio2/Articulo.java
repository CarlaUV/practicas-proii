package ejercicio2;

public class Articulo extends Publicacion{
    private final String nombreRevista;
    private final int volumen;
    private final int paginaInicial;
    private final int paginaFinal;
    
    public Articulo(String nombreRevista, int volumen, int paginaInicial, int paginaFinal, String titulo, int anho) {
        super(titulo, anho);
        if(volumen < 0) throw new IllegalArgumentException("El volumnen no puede ser negativo");
        if(paginaInicial < 0 || paginaFinal < paginaInicial) throw new IllegalArgumentException("Las páginas %s (inicial) y %s (final) son incrretas".formatted(paginaInicial, paginaFinal));
        if(nombreRevista.isBlank() || nombreRevista == null) throw new IllegalArgumentException("El nombre de la revista no puede estar en blanco");
        this.nombreRevista = nombreRevista;
        this.volumen = volumen;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }
    public int getVolumen() {
        return volumen;
    }
    public int getPaginaInicial() {
        return paginaInicial;
    }
    public int getPaginaFinal() {
        return paginaFinal;
    }

    @Override
    public String toString() {
        return """
                Artículo
                %s
                Nombre revista = %s
                Volumen = %d
                Página Inicial = %d 
                Página Final = %d
        """.formatted(super.toString(), getNombreRevista(), getVolumen(), getPaginaInicial(), getPaginaFinal());
    }
}
