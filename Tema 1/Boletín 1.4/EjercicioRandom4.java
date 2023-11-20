import java.util.Scanner;

public class EjercicioRandom4 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;
        char estCiv;
        final int caso1 = 35;
        final int caso2 = 50;
        final double retencion1 = 12, retencion2 = 8.5, retencion3 = 11.3, retencion4 = 10.5;

        System.out.println("Dime tu estado civil y tu edad");
        estCiv = tc.nextLine().charAt(0);
        edad = tc.nextInt();

        if (estCiv == 'S' || estCiv == 'D' && edad < caso1) {
            System.out.printf("Tu retención es del %f", retencion1);
        }
        if (edad > caso2) {
            System.out.printf("Tu retención es de un %f", retencion2);
        }
        if (estCiv == 'V' || estCiv == 'C' && edad < caso1) {
            System.out.printf("Tu retención es del %f", retencion3);
        }
        else
            System.out.printf("tu retención es del %f", retencion4);
    }

}