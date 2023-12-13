package EjercicioRandom;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class Revision {
    private LocalDateTime fecha;
    private boolean apto;
    //Se mide en meses.
    private int fechaDeValidez;

    public Revision(LocalDateTime fecha, boolean apto, int fechaDeValidez) {
        if (fecha.isBefore(LocalDateTime.now())){
            this.fecha = fecha;
        }
        this.apto = apto;
        if (fechaDeValidez > 0) {
            this.fechaDeValidez = fechaDeValidez;
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isApto() {
        return apto;
    }

    public int getFechaDeValidez() {
        return fechaDeValidez;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(formato) + " con resultado " + (apto ? "Satisfactorio. " + "Con una validez de "
                + fechaDeValidez + " meses" : "No es apto");
    }
}
