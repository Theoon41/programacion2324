import java.util.Scanner;

public class MiEntradaSalida {
    public static Scanner tc = new Scanner(System.in);

    /**
     * Lee un entero comprendido entre el mínimo y el máxiimo
     * @param min Valor mínimo aceptado
     * @param max Valor máximo aceptado
     * @return  El número leido
     */
    public static int leerEnteroDeRango(String mensaje, int min, int max){
        if (min >= max){
            // TODO: Hacer cuando conozcamos las excepciones
        }

        System.out.println(mensaje + ": ");
        int numLeido;
        do {
            numLeido = Integer.parseInt(tc.nextLine());
            if (numLeido < min || numLeido > max){
                System.out.printf("Introduce un valor entre %d y %d, por favor: ", min, max);
            }

        }while (numLeido < min || numLeido > max);
        return numLeido;
    }
    public static int leerEntero(String mensaje){
        System.out.println(mensaje + ": ");

        //TODO: Controlar excepciones

        return Integer.parseInt(tc.nextLine());
    }

    public static int leerEnteroPositivo(String mensaje){
        //TODO: Controlar excepciones
        System.out.println(mensaje + ": ");
        int numLeido;
        do {
            numLeido = Integer.parseInt(tc.nextLine());
            if (numLeido<0)
                System.out.println("Introduce un nuevo número positivo");

        }while (numLeido<0);
        return numLeido;
    }

    public static char leerSN(String mensaje){
        //TODO:Controlar excepciones
        System.out.println(mensaje + ": ");
        char sn;
        do {
            sn = tc.nextLine().toUpperCase().charAt(0);
        }while (sn != 'S' && sn != 'N');
        return sn;
    }
    public static boolean primo (int a){
        boolean primo = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.printf("El número %d es divisor de %d. ", i, a);
                primo = false;
                break;
            }
        }
        return primo;
    }
}
