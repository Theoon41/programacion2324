import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int b, exp, res = 1;
        System.out.println("Introduce el la base y el exponente");
        b = tc.nextInt();
        exp = tc.nextInt();

        if (b == 0) {
            if (exp != 0) {
                res = 0;
            }
        } else {
            for (int i = 1; i <= exp; i++) {
                res *= b;
            }
        }
        System.out.println("El resultado es " + res);
        tc.close();
    }
}
