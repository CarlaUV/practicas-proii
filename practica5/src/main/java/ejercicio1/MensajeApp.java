package ejercicio1;

class MensajeApp extends Mensaje {
    private String texto;

    public MensajeApp(String texto) {
        super(texto);
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void enviar() {
        System.out.println("[App] " + getTexto());
    }
}