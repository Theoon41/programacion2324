package Boletin6_1.Ejercicio3.model;

import Boletin6_1.Ejercicio3.Excepciones.MensajeException;

import java.time.LocalDate;

public class Alumno extends Persona {
    private static final int MAYORIA_DE_EDAD = 18;
    private LocalDate fechaNacimiento;

    public Alumno(String name, LocalDate fechaNacimiento) {
        super(name);
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void sendMessage(Persona p, String message)throws MensajeException {
        LocalDate fechaMinima = LocalDate.now().minusYears(MAYORIA_DE_EDAD);
        if(p instanceof  Alumno && fechaNacimiento.isAfter(fechaMinima)){
            throw new MensajeException("Los alumnos menores de edad no pueden mandar mensajes a otros alumnos");
        }
        super.sendMessage(p, message);
    }
}
