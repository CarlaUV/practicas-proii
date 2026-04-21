package ejercicio1;

abstract class Mensaje {
    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public abstract void enviar();
}