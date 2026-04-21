package ejercicio1;

class MensajeSMS extends Mensaje {
    private String texto;

    public MensajeSMS(String texto) {
        super(texto);
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void enviar() {
        System.out.println("[SMS] " + getTexto());
    }
}