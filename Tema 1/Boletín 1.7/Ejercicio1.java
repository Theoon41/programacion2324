import app.MiEntradaSalida;

import java.util.Scanner;


public class Ejercicio1 {
    //static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un valor positivo");
        if (num == reverse(num)) {
            System.out.println("Es capicua");
        } else {
            System.out.printf("El inverso de %d es %d", num, reverse(num));
        }

    }

    public static int reverse(int a) {
        int inv = 0;
        while (a % 10 != 0) {
            inv = inv * 10 + a % 10;
            a = a / 10;
        }
        return inv;
    }
}
