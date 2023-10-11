import java.util.Scanner;

public class Ejercicio10 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = tc.nextInt();
        System.out.println(factorial(num));
        //int fac = 1;
        /*do {
            System.out.println("Introduce un valor positivo para calcular su factorial");
            num = tc.nextInt();
        } while (num < 0);
        if (num == 0) {
            System.out.println("El factorial de 0 es 1");
        } else {
           //factorial(num);
            System.out.printf("El factorial de %d es %d", num, factorial(num));
        }
         */
        tc.close();
    }
    public static int factorial (int a){
        if (a == 0 || a == 1){
            return 1;
        }
        return a* factorial(a-1);
    }

    /*public static int factorial (int a){
        int acc=1;
        do {
            acc *= a;
            a--;
        }while (a>=1);
        return (acc);
    }*/
}


