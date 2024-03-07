package Bibloteca;

import java.util.Arrays;

public class Biblioteca {
    public static final int NUM_MAXIMO_USUARIOS = 3;
    public static final int NUM_MAXIMO_LIBROS = 6;
    public static final int NUM_MAXIMO_PRESTAMOS = 5;
    private final String nombre;
    private final Usuario[] usuarios;
    private final Libro[] libros;
    private final Prestamo[] prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
        this.libros = new Libro[NUM_MAXIMO_LIBROS];
        this.prestamos = new Prestamo[NUM_MAXIMO_PRESTAMOS];
    }

    public void altaSocio(Usuario u) throws BibliotecaException {
        if (existeUsuario(u)) {
            throw new BibliotecaException("El usuario ya existe");
        }

        int cuentaUsuarios = cuentaUsuarios();
        if (cuentaUsuarios == NUM_MAXIMO_USUARIOS) {
            throw new BibliotecaException("No podemos admitir más usuarios");
        }

        u.setNumSocio(String.valueOf(cuentaUsuarios + 1));

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = u;
                break;
            }
        }
    }

    public void agregarNuevoLibro(Libro l) throws BibliotecaException {
        if (existeLibro(l)) {
            throw new BibliotecaException("Este libro ya está dado de alta");
        }
        if (cuentaLibros() == NUM_MAXIMO_LIBROS) {
            throw new BibliotecaException("No podemos admitir más libros");
        }
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }
        }
    }

    public Prestamo realizarPrestamo(Usuario u, Libro l) throws BibliotecaException {
        /*
        1. No repetir 2 veces el mismo prestamo a la vez
        2. Disponibilidad del Libro
        3. No superar el número máximo de préstamos simultáneos
         */
        if (l.getEjmplaresDisponibles() == 0) {
            throw new BibliotecaException("No nos quedan ejemplares");
        }

        Prestamo[] prestamosActivosUsuario = getPrestamosActivosUsuario(u);

        if (prestamosActivosUsuario.length == Prestamo.NUM_MAXIMO_PRESTAMOS) {
            throw new BibliotecaException("No puedes hacer más prestamos");
        }

        for (int i = 0; i < prestamosActivosUsuario.length; i++) {
            if (prestamosActivosUsuario[i].getLibro().equals(l)) {
                throw new BibliotecaException("Ya has cogido este libro prestado y no lo has devuelto");
            }
        }

        for (int i = 0; i<prestamos.length; i++){
            if (prestamos[i] == null){
                prestamos[i] = new Prestamo(u,l);
                return prestamos[i];
            }
        }

        throw new BibliotecaException("La biblioteca ha llegado al límite de prestamos");
    }

    public void devolverPrestamo (Prestamo p) throws BibliotecaException {
        boolean prestamoEncontrado = false;
        for (int i = 0; i<prestamos.length && !prestamoEncontrado; i++){
            if (prestamos[i].equals(p)){
                prestamoEncontrado = true;
            }
        }
        if (!prestamoEncontrado){
            throw new BibliotecaException("No encuentro el prestamo");
        }
        if (!p.estaActivo()){
            throw new BibliotecaException("El prestamo ya ha sido devuelto");
        }

        p.devolver();
    }

    //Devuelve un entero con el numero de Prestamos activos del usuario
    public int getNumeroPrestamosActivosUsuario(Usuario u) {
        int contadorPrestamos = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                break;
            }
            if (prestamos[i].getUsuario().equals(u) && prestamos[i].estaActivo()) {
                contadorPrestamos++;
            }
        }
        return contadorPrestamos;
    }

    public Prestamo[] getPrestamosActivosUsuario(Usuario u) {
        Prestamo[] p = new Prestamo[getNumeroPrestamosActivosUsuario(u)];
        int cont = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                break;
            }
            if (prestamos[i].getUsuario().equals(u) && prestamos[i].estaActivo()) {
                p[cont++] = prestamos[i];
            }
        }
        return p;
    }

    //Comprueba que el usuario no exista ya.
    public boolean existeUsuario(Usuario u) {
        boolean existe = false;
        for (int i = 0; i < usuarios.length && !existe; i++) {
            if (u.equals(usuarios[i])) {
                existe = true;
            }
        }
        return existe;
    }

    //Contabiliza el número de usuarios que tiene la biblioteca
    public int cuentaUsuarios() {
        int cont = 0;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    public boolean existeLibro(Libro l) {
        boolean existe = false;
        for (int i = 0; i < libros.length && !existe; i++) {
            if (l.equals(libros[i])) {
                existe = true;
            }
        }
        return existe;
    }

    public int cuentaLibros() {
        int cont = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", usuarios=").append(Arrays.toString(usuarios));
        sb.append(", libros=").append(Arrays.toString(libros));
        sb.append('}');
        return sb.toString();
    }
}
