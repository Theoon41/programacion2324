package ejemplo1;

import java.sql.SQLOutput;

public class Hijo extends PadreSimple1{
    private String estudios;

    public Hijo(String nombre, String apellidos, String estudios){
        super(nombre, apellidos);
        this.estudios = estudios;
    }

    public String getEstudios() {
        return estudios;
    }

    public static void main(String[] args) {
        Hijo h = new Hijo("Juan", "Merino", "Bach");
        System.out.println(h.getNombre());
        System.out.println(h.getEstudios());
    }
}
