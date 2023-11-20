import java.util.Scanner;

public class Ejercicio9 {

    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Dime que número quieres comprobar.");
        //int num = tc.nextInt();
        for (int i = 1; i<=100; i++){
            if (esPerfecto(i)){
                System.out.printf("El número %d es perfecto\n", i);
            }
        }
    }

    public static boolean esPerfecto(int a){
        int suma = 0;
        for (int i=1; i<=a/2; i++){
            if (a % i == 0){
                suma += i;
            }
        }
        return suma==a;
    }

}