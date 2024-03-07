import app.MiEntradaSalida;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    //public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce el valor que deseas buscar");

        int tamArray = MiEntradaSalida.leerEnteroPositivo("Introduce un el tamaño del array");

        int[] array = generaArrayAleatorio(tamArray);
        if (contieneElemento(array, num)) {
            System.out.println("Se ha encontrado el valor");
        }else {
            System.out.println("No se ha encontrado el valor");
        }

    }

    public static boolean contieneElemento(int[] a, int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
               return true;
            }
        }
        return false;
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