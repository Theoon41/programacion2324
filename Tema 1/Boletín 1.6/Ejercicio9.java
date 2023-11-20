import java.util.Scanner;

public class Ejercicio9 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Aquí tienes las tablas de multiplicar del 1 al 10.");
        for (int i = 0; i<=10; i++) {
            for (int u = 0; u <= 10; u++) {
                System.out.printf("%2.5s\n", u * i);
            }
        }
    }

}
