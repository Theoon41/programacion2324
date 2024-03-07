package Boletin6_1.Ejercicio3.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje implements Comparable<Mensaje> {
    private String text;
    private Persona remitente;
    private LocalDateTime fecha;

    public Mensaje(Persona remitente, String text) {
        this.text = text;
        this.remitente = remitente;
        fecha = LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        StringBuilder sb = new StringBuilder("De: ").append(remitente.getName());
        sb.append(" text: ").append(text).append('\'');
        sb.append(" fecha y hora: ").append(fecha.format(formato));
        return sb.toString();
    }

    @Override
    public int compareTo(Mensaje mensaje) {
        return mensaje.fecha.compareTo(fecha);
    }
}
