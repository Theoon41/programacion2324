import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(1, 101);
        System.out.printf("El número que vamos a usar es %d.\n", num);
       /* for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.printf("El número %d es divisor de %d. No es primo", i, num);
                primo = false;
                break;
            }
        }*/

        if (primo(num)) {
            System.out.printf("El número %d es primo.\n", num);
        }else {
            System.out.println(" No es primo\n");
        }


        tc.close();
    }
    public static boolean primo (int a){
        boolean primo = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.printf("El número %d es divisor de %d. ", i, a);
                primo = false;
                break;
            }
        }
        return primo;
    }
}