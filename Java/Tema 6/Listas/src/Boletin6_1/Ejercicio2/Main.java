package Boletin6_1.Ejercicio2;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Equipo<Alumno> equipo1 = new Equipo<>("Malabaristas FC");
        Equipo<Alumno> equipo2 = new Equipo<>("Betih");
        Equipo<Integer> equipo3 = new Equipo<>("Real Albacete");
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

            try {
                equipo3.addAlumno(generarEnteros());
            } catch (EquipoException e) {
                System.out.println("Entero repetido");
            }

        }
        Equipo<Alumno> equipoU = equipo1.unionEquipos(equipo2);
        System.out.println("Equipo Union: ");
        mostrarConjuntoAlumnos(equipoU.getAlumnos());
        Equipo<Alumno> equipoI = equipo1.jugadoresComunesEquipos(equipo2);
        System.out.println("Equipo  Interseccion: ");
        mostrarConjuntoAlumnos(equipoI.getAlumnos());
        mostrarConjuntoAlumnos(equipo3.getAlumnos());
    }

    public static <E> void  mostrarConjuntoAlumnos(Set<E> a){
        Iterator<E> it = a.iterator();
        while (it.hasNext()){
            E alumno = it.next();
            System.out.println("Alumno: " + alumno.toString());
        }
    }

    public static Integer generarEnteros(){
        Random r = new Random();
        return r.nextInt(10);
    }

    public static Alumno generarAlumno(){
        String nombre;
        Random r = new Random();
        nombre = "" + r.nextInt(12);
        return new Alumno(nombre, nombre);
    }

}
