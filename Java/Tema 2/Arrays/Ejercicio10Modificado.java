import app.MiEntradaSalida;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//La modificación consiste en que solo acepte un array y elimine los duplicados
public class Ejercicio10Modificado {
    //public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {

        int tamArray = MiEntradaSalida.leerEnteroPositivo("Introduce un el tamaño del array");


        int[] array1 = generaArrayAleatorio(tamArray);
        int[] array2 = arraySinDuplicados(array1);

        System.out.println(Arrays.toString(array2));

    }
    public static int[] arraySinDuplicados(int[]a) {
        int [] ar = new int[]{a.length};
        int numElemNoRepetidos = 0;
        for (int i=0; i<a.length;i++){
            for (int j=0; j<a.length; j++){
                if (a[i] != a[j]){
                    a[i] = ar[numElemNoRepetidos++];
                }
            }
        }
        return ar;
    }


    public static int indexOf ( int[] a, int b){
        int pos = -1;
        for (int i = 0; i < a.length && pos == -1; i++) {
            if (a[i] == b) {
                pos = i;
            }
        }
        return pos;
    }

    public static boolean contieneElemento ( int[] a, int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }
        }
        return false;
    }

    public static int[] generaArrayAleatorio ( int a){
        int[] array = new int[a];
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }

        return array;
    }

}