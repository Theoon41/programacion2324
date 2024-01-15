package untitled;

public class Ejercicio5 {
    public static void main(String[] args) {

    }
    public static void sustituiralabra(String cadena, String palabraBorrar, String palabraAgregar){
        StringBuilder str = new StringBuilder(cadena);

        //for (int i = cadena.indexOf(palabraBorrar); i != -1; i+=palabraAgregar.length()){
        for (int i = cadena.indexOf(palabraBorrar); i != -1; i+=palabraAgregar.length()){

            if (i != -1){
                str.delete(i, i+palabraBorrar.length());
                str.insert(i, palabraAgregar);
            }else{
                break;
            }
        }

    }
}
