import app.MiEntradaSalida;

import java.util.Scanner;


public class Ejercicio4 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int horas = horas("Introduce una hora base");
        int min = minutos("Introduce los minutos base");
        int seg = segundos("Introduce los segundos base");

        int horas2 = horas("¿Cuantas horas quieres sumar?");
        int min2 = minutos("¿Cuantas horas quieres sumar?");
        int seg2 = segundos("¿Cuantas horas quieres sumar?");

        if ((seg += seg2) > 59){
            seg += seg2 -59;
            min++;
        }else{
            seg += seg2;
        }

        if ((min += min2) > 59){
            min += min2 -59;
            horas ++;
        }else{
            min += min2;
        }

        if ((horas += horas2) > 23){
            horas += horas2 -23;
            System.out.printf("La hora resultante es: %d:%d:%d, del día siguiente",horas,min,seg);
        }else{
            horas += horas2;
        }
        System.out.printf("La hora resultante es: %d:%d:%d",horas,min,seg);
        tc.close();

    }

    public static int horas(String mensaje) {
        int h = 0;
        do {
            h=tc.nextInt();
        }while (h<0 || h>23);
        return h;
    }
    public static int minutos(String mensaje) {
        int m = 0;
        do {
            m=tc.nextInt();
        }while (m<0 || m>59);
        return m;
    }
    public static int segundos(String mensaje) {
        int s = 0;
        do {
            s=tc.nextInt();
        }while (s<0 || s>59);
        return s;
    }
}
