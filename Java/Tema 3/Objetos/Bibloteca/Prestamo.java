package Bibloteca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Prestamo {
    public static final int NUM_DIAS_PRESTAMO = 12;
    public static final int NUM_MAXIMO_PRESTAMOS = 3;
    private LocalDateTime fechaInicio;
    private LocalDate fechaLimiteDevolucion;
    private LocalDateTime fechaRealDevolucion;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) throws BibliotecaException{
        this.fechaInicio = LocalDateTime.now();
        this.fechaLimiteDevolucion = fechaInicio.plusDays(NUM_DIAS_PRESTAMO).toLocalDate();
        this.usuario = usuario;
        this.libro = libro;
        this.libro.prestamo();
    }

    public boolean estaActivo(){
        return fechaRealDevolucion == null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFechaLimiteDevolucion() {
        return fechaLimiteDevolucion;
    }

    public void devolver() throws BibliotecaException {
        fechaRealDevolucion = LocalDateTime.now();
        this.libro.devolverPrestamo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(fechaInicio, prestamo.fechaInicio) && Objects.equals(usuario, prestamo.usuario) && Objects.equals(libro, prestamo.libro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, usuario, libro);
    }
}
