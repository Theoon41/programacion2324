import java.util.Scanner;

public class EjercicioRandom3 {
    static Scanner tc = new Scanner(System.in);
    static double suma = 0;
    static double cont = 0;

    public static void main(String[] args) {
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double num;
        do {
            System.out.println("Dime un valor");
            num = Double.parseDouble(tc.nextLine());
            if (num >= 0) {
                media(num);
                if (num > max) {
                    max = num;
                }
                if (num <= min) {
                    min = num;
                }
            } else
                System.out.println("Número no válido");

        } while (num != -1);

        System.out.printf("El mayor número introducido ha sido %f, y el menor ha sido %f", max, min);

        tc.close();
    }

    public static double media(double a) {
        if (a >= 0) {
            suma += a;
            cont++;
        } else {
            System.out.println("Ese número no es válido. Tu media actual es: " + suma / cont);
        }
        return (suma / cont);
    }
}