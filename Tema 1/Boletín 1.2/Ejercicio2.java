import java.util.Scanner;

public class Ejercicio2 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime los grados que hay");
        double celsius = Double.parseDouble(tc.nextLine());
        double farenjain = ((celsius * 9 / 5) + 32);
        System.out.printf("En Fahrenheit es %.2f.\n", farenjain);
        tc.close();
    }
}
