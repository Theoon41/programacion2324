package untitled;

import java.sql.SQLOutput;

public class Ejercicio7 {
    public static void main(String[] args) {
        //desordenarCadena("Cocacola");
        System.out.println(desordenarCadena2("Cocacola"));
    }

    public static void desordenarCadena(String cadena) {
        cadena = cadena.toLowerCase();
        StringBuilder cadenaVocales = new StringBuilder();
        StringBuilder cadenaConsonantes = new StringBuilder();


        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cadenaVocales.append(cadena.charAt(i));
                    break;
                default:
                    cadenaConsonantes.append(cadena.charAt(i));
            }
        }

        System.out.println(cadenaConsonantes.append(cadenaVocales));
    }

    public static String desordenarCadena2(String cadena) {
        StringBuilder frase = new StringBuilder(cadena.toLowerCase().replaceAll("\\s+", ""));
        int cont = 0;

        for (int i = 0; cont < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                case '¡':
                case 'e':
                case 'o':
                case 'u':
                    frase.append(frase.charAt(i));
                    frase.deleteCharAt(i);
                    i--;
            }
            cont++;
        }
        return frase.toString();
    }
}
