package Bibloteca;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String numSocio;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", numSocio='").append(numSocio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
