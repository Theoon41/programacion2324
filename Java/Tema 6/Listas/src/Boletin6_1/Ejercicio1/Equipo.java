package Boletin6_1.Ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
    private String nombreEquipo;
    private Set<Alumno> alumnos;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.alumnos = new HashSet<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void addAlumno(Alumno a) throws EquipoException {
        if (!alumnos.add(a)) {
            throw new EquipoException("El alumno ya ha sido agregado previamente a este equipo");
        }
        alumnos.add(a);
    }

    public void deleteAlumno(Alumno a) throws EquipoException {
        if (!alumnos.remove(a)) {
            throw new EquipoException("El alumno No existe en este equipo");
        }
        alumnos.remove(a);
    }

    public Alumno contieneAlumno(Alumno a) {
        return !alumnos.contains(a) ? null : a;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public Equipo unionEquipos(Equipo e2) {
        Equipo resultante = new Equipo("Union de: " + this.nombreEquipo + " con " + e2.nombreEquipo);
        resultante.alumnos.addAll(this.alumnos);
        resultante.alumnos.addAll(e2.alumnos);
        return resultante;
    }
    public Equipo jugadoresComunesEquipos(Equipo e2) {
        Equipo resultante = new Equipo("Jugadores comunes de: " + this.nombreEquipo + " y " + e2.nombreEquipo);
        resultante.alumnos.addAll(this.alumnos);
        resultante.alumnos.retainAll(e2.alumnos);
        return resultante;
    }
}
