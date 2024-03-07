package Boletin6_1.Ejercicio3.main;

import Boletin6_1.Ejercicio3.Excepciones.MensajeException;
import Boletin6_1.Ejercicio3.model.Alumno;
import Boletin6_1.Ejercicio3.model.Persona;
import Boletin6_1.Ejercicio3.model.Profesor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona al1 = new Alumno("Manueh", LocalDate.of(2004, 3, 14));
        Persona al2 = new Alumno("Antonio", LocalDate.of(2003, 4, 27));
        Persona prof1 = new Profesor("Juan");
        Persona al3 = new Alumno("Isa", LocalDate.of(2007, 8, 5));

        List<Persona> personas = new ArrayList<>();

        personas.add(al1);
        personas.add(al2);
        personas.add(prof1);
        personas.add(al3);

        try{
            personas.get(2).sendMessage(personas.get(0), "Mensaje prueba0");
            Thread.sleep(1000);
            personas.get(1).sendMessage(personas.get(0), "Mensaje prueba1");
            Thread.sleep(1000);
            personas.get(1).sendMessage(personas.get(0), "Mensaje prueba2");
            Thread.sleep(1000);
            personas.get(2).sendMessage(personas.get(0), "Mensaje prueba3");
        }catch (MensajeException e){
            System.out.println(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sin ordenar");
        System.out.println(personas.get(0).readMessage());
        /*System.out.println("Ordenado");
        System.out.println(personas.get(0).readMessageOrdenado());
        System.out.println("Orden con Compareh");
        System.out.println(personas.get(0).readMessageAlfabetic());*/

        try {
            personas.get(0).borrarMessage(10);
        }catch (MensajeException e){
            System.out.println(e.getMessage());
        }

        try {
            personas.get(0).messageFilter("Mensaje");
        } catch (MensajeException e) {
            System.out.println(e.getMessage());
        }
    }
}
