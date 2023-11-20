import java.util.Scanner;

public class EjercicioRandom5 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int h, min, seg;
        int h2, min2, seg2;

        System.out.println("Introduce la primera hora");
        do{
            h = tc.nextInt();
            min = tc.nextInt();
            seg = tc.nextInt();

        }while(h > 23 || h < 0 || min > 59 || min < 0 || seg > 59 || seg < 0);
        System.out.println("Introduce la segunda hora");
        do{
            h2 = tc.nextInt();
            min2 = tc.nextInt();
            seg2 = tc.nextInt();

        }while(h2 > 23 || h2 < 0 || min2 > 59 || min2 < 0 || seg2 > 59 || seg2 < 0);

        if (h==h2){
            if (min==min2){
                if (seg == seg2){
                    System.out.println("Son la misma hora");
                }
                if (seg > seg2){
                    System.out.println("Hora 1 es mayor");
                }
            }
            if (min > min2){
                System.out.println("Hora 1 es mayor");
            }
        }
        if (h>h2){
            System.out.println("Hora 1 es mayor");
        }else
            System.out.println("Hora 2 es mayor");
    }

}