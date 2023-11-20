import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tus datos.");
        String name = teclado.nextLine();
        double alt = teclado.nextFloat();
        teclado.nextLine();
        int edad = teclado.nextInt();
 ;       System.out.println("Me llamo " + name + "tengo " + edad + " años y mido " + alt + "cm");
    }
}