//Bucle para encontrar el primer divisor de un número
import java.util.Scanner;

public class BucleWhile {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dame un valor para comenzar");
        int valor = teclado.nextInt();
        teclado.nextLine();
        int i = 2;
        boolean find = false;

        while (valor % i!=0) {
            ++i;
        }
        System.out.println("Es divisible entre "+ i);
    }
}