import java.util.Scanner;

public class Ejercicio10 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        char ope;
        double val1, val2;
        System.out.println("introduce los valores");
        val1 = Double.parseDouble(tc.nextLine());
        val2 = Double.parseDouble(tc.nextLine());
        do{
            System.out.println("Introduce un operando valido");
            ope = tc.nextLine().charAt(0);
        }while(ope != '+' && ope != '-' && ope != '*' && ope != '/');
        switch (ope){
            case '+':
                System.out.println("El resultado es " + (val1+val2));
                break;
            case '-':
                System.out.println("El resultado es " + (val1-val2));
                break;
            case '*':
                if (val2 == 0) {
                    System.out.println("Error no se puede dividir entre 0");
                    break;
                }
                System.out.println("El resultado es " + (val1*val2));
                break;
            case '/':
                System.out.println("El resultado es " + (val1/val2));
                break;
        }
        tc.close();
    }
}