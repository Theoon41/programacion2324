//import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime los números que quieres introducir");
        int cont = tc.nextInt();
        tc.nextLine();

        if (cont > 0) {
            for (int i = 1; i <= cont; i++) {
                System.out.printf("Dime el %2d valor\n", i);
                int num = tc.nextInt();
                tc.nextLine();
                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.printf("%2d es par\n", num);
                    } else {
                        System.out.printf("%2d es impar\n", num);
                    }
                } else {
                    System.out.println("Dame un número positivo porfavor");
                    i--;
                }
            }
        }
        System.out.println("Nos vemos la próxima");
        tc.close();
    }
}
