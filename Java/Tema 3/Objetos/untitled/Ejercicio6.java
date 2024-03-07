package untitled;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "Abaco";
        System.out.println(contadorVocalesDistintas(cadena));
        System.out.println(contarVocalesDiferentes(cadena));
    }
    //Cuenta las vocales de la cadena y por cada contador superior a 0 te contaviliza que la vocal existe.
    public static int contadorVocalesDistintas(String cadena){
        int numVocales=0;
        int contA=0;
        int contE=0;
        int contI=0;
        int contO=0;
        int contU=0;

        for (int i=0; i<cadena.length(); i++){
            if (cadena.toLowerCase().indexOf("a", i) != -1){
                contA++;
            }
            if (cadena.toLowerCase().indexOf("e", i) != -1){
                contE++;
            }
            if (cadena.toLowerCase().indexOf("i", i) != -1){
                contI++;
            }
            if (cadena.toLowerCase().indexOf("o", i) != -1){
                contO++;
            }
            if (cadena.toLowerCase().indexOf("u", i) != -1){
                contU++;
            }
        }

        if (contA > 0) numVocales++;
        if (contE > 0) numVocales++;
        if (contI > 0) numVocales++;
        if (contO > 0) numVocales++;
        if (contU > 0) numVocales++;

        return numVocales;
    }
    //Comprueba que
    public static int contarVocalesDiferentes(String cadena){
        int contVocales = 0;
        cadena = cadena.toLowerCase();

        char[] vocales = {'a','e','i','o','u'};

        for (char v:vocales){
            if (cadena.contains(v+"")) contVocales++;
        }
        return contVocales;
    }
}
