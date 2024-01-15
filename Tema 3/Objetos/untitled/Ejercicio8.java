package untitled;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(contarPalabras("cadena"));
    }

    public static int contarPalabras(String cadena) {
        return cadena.isBlank() ? 0 : cadena.trim().split("\\s+").length;
    }
}
