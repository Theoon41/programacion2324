import java.util.Scanner;

public class Ejercicio8 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce los valores para hacer la ecuación");
        double a = tc.nextInt();
        double b = tc.nextInt();
        double c = tc.nextInt();
        double pos, neg;
        pos = (-b + Math.sqrt(b*b-(4*a*c)))/2*a;
        neg = (-b - Math.sqrt(b*b-(4*a*c)))/2*a;
        if (a != 0){
            if ((b*b-(4*a*c)) == 0) {
                System.out.printf("Solo existe una solución real %f.", pos);
            }else if ((b*b-(4*a*c)) > 0){
                System.out.printf("Existen dos soluciones reales. La raiz positiva es %f y la negativa es %f.", pos, neg);
            }else{
                System.out.println("No hay soluciones reales");
            }
        }else {
            System.out.println(" No hay solución real, estás dividiendo entre 0, la ecuación es de primer grado.");
        }
        tc.close();

    }

}
