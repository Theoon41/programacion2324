import app.MiEntradaSalida;

import java.util.Scanner;


public class Ejercicio2 {
    final static int M_VALUE = 1000;
    final static int D_VALUE = 500;
    final static int C_VALUE = 100;
    final static int L_VALUE = 50;
    final static int X_VALUE = 10;
    final static int V_VALUE = 5;
    final static int I_VALUE = 1;
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un número romano");
        String numR = tc.nextLine().toUpperCase();
        int valD = 0;
        int lastVal = 0;

        for (int i = 0; i<numR.length();i++){
            char digito = numR.charAt(i);
            int digitVal = valor (digito);

            if (i==0){
                lastVal = digitVal;
            }else{
                if (lastVal >=digitVal){
                    valD = lastVal;
                    lastVal = digitVal;
                }else{
                    valD += digitVal -lastVal;
                    lastVal = digitVal;
                }
            }
        }
        System.out.printf("El valor en número romanos es %d", valD);
    }

    public static int valor(char c) {
        return switch (c) {
            case 'M':
                yield M_VALUE;
            case 'D':
                yield D_VALUE;
            case 'C':
                yield C_VALUE;
            case 'L':
                yield L_VALUE;
            case 'X':
                yield X_VALUE;
            case 'V':
                yield V_VALUE;
            case 'I':
                yield I_VALUE;
            default:
                yield -1;
        };
    }
}