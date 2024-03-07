import java.util.Scanner;

public class Ejercicio7 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = leerEnteroPositivo("Introduce un número positivo");
        int num2 = leerEnteroPositivo("Introduce un número positivo");
        int resto;
        int op1 = num1;
        int op2 = num2;
        do{
            resto = op1 % op2;
            op1 = op2;
            op2 = resto;
        }while (resto != 0);
        System.out.printf("El mínimo comun multiplo entre %d y %d es %d. ", num1, num2, op1);
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

}