import app.MiEntradaSalida;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    //public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {

        int tamArray = MiEntradaSalida.leerEnteroPositivo("Introduce un el tamaño del array");

        int[] array1 = generaArrayAleatorio(tamArray);
        System.out.println(Arrays.toString(array1));
        int[] array2 = burbuja(array1);

        System.out.println(Arrays.toString(array2));

    }

    public static int [] burbuja(int []a){
        int aux;
        for (int i=1; i<a.length; i++){
            for(int j=0; j<a.length-i; j++){
                if (a[j]>a[j+1]){
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1]=aux;
                }
            }
        }
        return a;
    }
    public static int[] arraySinDuplicados(int[]a, int[]b) {
        int[] ar = new int[b.length];
        int elementosAñadidos = 0;
        for (int i = 0; i < b.length; i++) {
            if (indexOf(a, i) == -1) {
                ar[elementosAñadidos++] = b[i];
            }
        }
        int [] ar2 = new int [elementosAñadidos];
        for (int i = 0; i<elementosAñadidos; i++){
            ar2[i]= ar[i];
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