package Boletin6_1.Ejercicio1;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Malabaristas FC");
        Equipo equipo2 = new Equipo("Betih");
        Equipo equipo3 = new Equipo("Real Albacete");
        for ( int i = 0; i < 7; i++){
            try{
                equipo1.addAlumno(generarAlumno());
            } catch (EquipoException e) {
                System.out.println("Alumno repetido");
            }
            try{
                equipo2.addAlumno(generarAlumno());
            } catch (EquipoException e) {
                System.out.println("Alumno repetido");
            }
            try{
                equipo3.addAlumno(generarAlumno());
            } catch (EquipoException e) {
                System.out.println("Alumno repetido");
            }
        }
        Equipo equipoU = equipo1.unionEquipos(equipo2);
        System.out.println("Equipo Union: ");
        mostrarConjuntoAlumnos(equipoU.getAlumnos());
        Equipo equipoI = equipo2.jugadoresComunesEquipos(equipo3);
        System.out.println("Equipo  Interseccion: ");
        mostrarConjuntoAlumnos(equipoI.getAlumnos());
    }

    public static void  mostrarConjuntoAlumnos(Set<Alumno> a){
        Iterator<Alumno> it = a.iterator();
        while (it.hasNext()){
            Alumno alumno = it.next();
            System.out.println("Alumno: " + alumno.toString());
        }
    }

    public static Alumno generarAlumno(){
        String nombre;
        Random r = new Random();
        nombre = "" + r.nextInt(12);
        return new Alumno(nombre, nombre);
    }

}
