import java.util.Scanner;

public class Ejercicio4 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int suma = 0;

        do {
            System.out.println("Introduce un número que sea positivo.");
            num = tc.nextInt();
        } while (num < 0);

        for (int i = 1; i <= num; i++) {
            suma += i;
        }

        System.out.printf("La suma de los %d primeros números es %d\n", num, suma);
    }
}
