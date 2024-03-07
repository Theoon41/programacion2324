import java.util.Scanner;

public class Ejercicio8 {

    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un número");
        int num = tc.nextInt();
        tc.nextLine();
        int menor = num;
        String sn;
        do {
            System.out.println("¿Deseas introducir más números? Introduzca un valor correcto porfavor.");
            sn = tc.nextLine();
            if (sn.equalsIgnoreCase("s")) {
                System.out.println("Introduce un número");
                num = tc.nextInt();
                tc.nextLine();
                if (num < menor) {
                    menor = num;
                }
            } else if (sn.equalsIgnoreCase("n")) {
                break;
            }else{
                System.out.println("Ese valor no es correcto, repitamelo.");
            }
        } while (true);
        System.out.printf("El valor del menor número introducido ha sido %d. Hasta la próxima", menor);
    }
}

