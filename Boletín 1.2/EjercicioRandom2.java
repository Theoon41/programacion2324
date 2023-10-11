import java.util.Scanner;

public class EjercicioRandom2 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dime hasta que número quieres conocer");
        int num = tc.nextInt();
        fibonacci(num);
        System.out.printf("");
        tc.close();
    }
    public static int fibonacci(int a){
        if ( a == 1 || a == 2){
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }
}