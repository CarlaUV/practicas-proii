package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class PruebaNotificacionesIfElseMain {

    public static void main(String[] args) {

        List<Mensaje> mensajes = new ArrayList<>();

        mensajes.add(new MensajeEmail("Este es el contenido del email."));

        mensajes.add(new MensajeSMS("Este es el contenido del SMS."));

        mensajes.add(new MensajeApp("Este es el contenido de la notificación de la app."));

        for (Mensaje mensaje : mensajes) {
            mensaje.enviar();
        }
    }
}
