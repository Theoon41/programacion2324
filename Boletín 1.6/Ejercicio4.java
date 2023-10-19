import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(1, 101);
        final int INTENTOS = 7, MIN = 1, MAX = 100;
        int num;

        System.out.println("Prueba suerte");
        for (int i = 1; i <= INTENTOS; i++){
            num = tc.nextInt();

            if (num == rand){
                System.out.println("Bien has ganado");
                break;
            }else if (num < rand){
                if (num < MIN){
                    System.out.printf("El número es más pequeño que %d no es valido", MIN);
                }else {
                    System.out.println("El número introducido es más pequeño, prueba suerte de nuevo");
                }
            }else {
                if (num > MAX) {
                    System.out.printf("El número es más mañor que %d no es valido", MAX);
                }else{
                    System.out.println("El número introducido es mayor, prueba suerte de nuevo");
                }
            }
            if (i == INTENTOS){
                System.out.printf("No te queda más INTENTOS bien intentado. El número era %d", rand);
            }
        }

        tc.close();
    }
}
