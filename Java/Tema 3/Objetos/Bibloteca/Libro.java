package Bibloteca;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String sinopsis;
    private int numeroEjemplares;
    private int ejemplaresDisponibles;

    public Libro(String titulo, String autor, String sinopsis, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresDisponibles = numeroEjemplares;
    }

    public void prestamo() throws BibliotecaException {
        if (ejemplaresDisponibles == 0){
            throw new BibliotecaException("No quedan ejemplares disponibles");
        }
        ejemplaresDisponibles--;
    }

    public void devolverPrestamo() throws BibliotecaException {
        if (ejemplaresDisponibles == numeroEjemplares){
            throw new BibliotecaException("El libro no dispone de más ejemplares");
        }
        ejemplaresDisponibles++;
    }

    public int getEjmplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append(titulo).append(" - ");
        sb.append(autor).append(' ');
        sb.append(", ejemplares ").append(ejemplaresDisponibles);
        sb.append(" / ").append(numeroEjemplares);
        sb.append('}');
        return sb.toString();
    }
}
