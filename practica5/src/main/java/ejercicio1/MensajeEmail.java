package ejercicio1;

class MensajeEmail extends Mensaje {
    private String texto;

    public MensajeEmail(String texto) {
        super(texto);
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void enviar() {
        System.out.println("[Email] " + getTexto());
    }
}