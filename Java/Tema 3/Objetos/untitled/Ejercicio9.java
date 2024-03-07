package untitled;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("El numero resultante es  el siguiente: " + contadorDeNumeros("Hola 2034 com anda7 de5mos hoy a "));
    }

    public static int contadorDeNumeros(String cadena) {
        int acu = 0;
        int numActual = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                numActual = numActual * 10 + Integer.parseInt(cadena.charAt(i) + "");
            } else if (numActual > 0) {
                acu += numActual;
                numActual = 0;
            }
        }
        return acu + numActual;
    }
}
