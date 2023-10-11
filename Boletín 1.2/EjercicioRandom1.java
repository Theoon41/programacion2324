import java.util.Scanner;

public class EjercicioRandom1 {
    static Scanner tc = new Scanner(System.in);
    static int i;

    public static void main(String[] args) {
        System.out.println("Introduce los números que quieras comprobar.");
        int num1 = tc.nextInt();
        int num2 = tc.nextInt();
        tc.nextLine();
        if (primoEntreSi(num1, num2)){
            System.out.println("Son primos entre si");
        }else {
            System.out.printf("Se ha encontrado un divisor común. %d divide a ambos.", i);
        }
        tc.close();
    }

    public static boolean primoEntreSi(int a, int b) {
        for (i = 2; i != a && i != b; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }
}