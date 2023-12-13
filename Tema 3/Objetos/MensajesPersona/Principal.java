package MensajesPersona;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manolo López");
        Persona p2 = new Persona("Jose Martínez");

        try {
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");
            p1.enviarMensaje(p2, "Examen BD", "Illo tu como lo lleva, yo voy a suspenderlo.");

        }catch (MensajeException m){
            System.out.println(m.getMessage());
        }
        p1.mostrarBandejaSalida();
        p2.mostrarBandejaEntrada();

    }
}
