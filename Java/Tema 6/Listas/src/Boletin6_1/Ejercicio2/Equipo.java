package Boletin6_1.Ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class Equipo<E> {
    private String nombreEquipo;
    private Set<E> alumnos;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.alumnos = new HashSet<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void addAlumno(E a) throws EquipoException {
        if (!alumnos.add(a)) {
            throw new EquipoException("El alumno ya ha sido agregado previamente a este equipo");
        }
        alumnos.add(a);
    }

    public void deleteAlumno(E a) throws EquipoException {
        if (!alumnos.remove(a)) {
            throw new EquipoException("El alumno No existe en este equipo");
        }
        alumnos.remove(a);
    }

    public E contieneAlumno(E a) {
        return !alumnos.contains(a) ? null : a;
    }

    public Set<E> getAlumnos() {
        return alumnos;
    }

    public Equipo<E> unionEquipos(Equipo<E> e2) {
        Equipo<E> resultante = new Equipo<>("Union de: " + this.nombreEquipo + " con " + e2.nombreEquipo);
        resultante.alumnos.addAll(this.alumnos);
        resultante.alumnos.addAll(e2.alumnos);
        return resultante;
    }
    public Equipo<E> jugadoresComunesEquipos(Equipo<E> e2) {
        Equipo<E> resultante = new Equipo<>("Jugadores comunes de: " + this.nombreEquipo + " y " + e2.nombreEquipo);
        resultante.alumnos.addAll(this.alumnos);
        resultante.alumnos.retainAll(e2.alumnos);
        return resultante;
    }
}
