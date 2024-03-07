package ejemplo1;

public class PadreSimple1 {
    private String nombre;
    private String apellidos;

    public PadreSimple1(String nombre){
        this.nombre = nombre;
    }

    public PadreSimple1(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
