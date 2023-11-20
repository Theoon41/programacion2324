import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int cont;
        int cifra=0;
        do{
            System.out.println("Introduce un número");
            num = tc.nextInt();
        }while(num<=0);
        cont = num;
        do{
            cont = cont/10;
            cifra++;
        }while (cont == 0);
        System.out.printf("El número %d tiene %d cifras", num, cifra);
        tc.close();
    }

}