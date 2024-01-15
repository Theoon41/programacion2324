package untitled;

public class Ejercicio10 {
    public static final String comienzoCorrecto = "http://www";
    public static void main(String[] args) {
        System.out.println(esValido("http://www.miravent1.es"));
    }
    public static boolean esValido(String cadena){
        String[] cadenaDividida = cadena.split("\\.");
        if(cadenaDividida.length != 3){return false;}
        if(!(cadenaDividida[0].equals(comienzoCorrecto))){return false;}
        if(cadenaDividida[1].contains(" ")){return false;}
        if(Character.isDigit(cadenaDividida[1].charAt(0))){return false;}
        return cadenaDividida[2].equals("com") || cadenaDividida[2].equals("es");
    }
}
