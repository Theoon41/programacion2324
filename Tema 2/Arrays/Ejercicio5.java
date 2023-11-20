import app.MiEntradaSalida;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int tamArray = MiEntradaSalida.leerEnteroPositivo("Introduce un el tamaño del array");

        int[] array = generaArrayAleatorio(tamArray);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("En la posición %d está el valor %d.\n", i, array[i]);
        }
    }

    public static int[] generaArrayAleatorio(int a) {
        int[] array = new int[a];
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1001);
        }

        return array;
    }
}
