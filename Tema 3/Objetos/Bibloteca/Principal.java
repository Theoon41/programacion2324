package Bibloteca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Biblioteca b = new Biblioteca("Biblioteca");
        Usuario u = new Usuario("Juan", "Martinez", "29761887V");
        Usuario u2 = new Usuario("Manolo", "López", "29751223M");
        Libro l = new Libro("Platero y yo", "Juan Ramón Jiménez", "aoiwohgui", 2);
        try {
            b.altaSocio(u);
            b.altaSocio(u2);
            b.agregarNuevoLibro(l);
            System.out.println(b);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
        try {
            Prestamo p = b.realizarPrestamo(u, l);
            System.out.println("La fecha de devolución es "+ p.getFechaLimiteDevolucion().format(formato));
            Prestamo p2 = b.realizarPrestamo(u2, l);
            System.out.println("La fecha de devolución es "+ p2.getFechaLimiteDevolucion().format(formato));
        }catch (BibliotecaException e){
            System.out.println(e.getMessage());
        }

    }
}
