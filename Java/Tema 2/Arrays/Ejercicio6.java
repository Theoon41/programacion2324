import app.MiEntradaSalida;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce el valor que deseas buscar");

        int tamArray = MiEntradaSalida.leerEnteroPositivo("Introduce un el tamaño del array");

        int[] array = generaArrayAleatorio(tamArray);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.printf("Ese valor se encuentra en la posicion %d", i);
            }
        }
        System.out.println("No se ha encontrado ese valor");

        tc.close();
    }

    public static int[] generaArrayAleatorio(int a) {
        int[] array = new int[a];
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }

        return array;
    }
}
