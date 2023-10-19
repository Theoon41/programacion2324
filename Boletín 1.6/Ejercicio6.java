
import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int numAl, nota, aprobados = 0, suspensos = 0;
        System.out.println("Introduce el número de alumnos");
        numAl = Integer.parseInt(tc.nextLine());


        for (int i = 1; i <= numAl; i++){
            System.out.printf("Introduce la nota del %d alumno ", i);
            nota = leerEnteroDeRango("Introduce un número entre 0 y 10", 0, 10);
            if (nota >= 5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        System.out.printf("Han aprobado %d alumnos y han suspendido %d alumnos\n", aprobados, suspensos);
        System.out.println("El porcentaje de aprobados es de "+ ((double)aprobados/numAl*100) + "%");
    }
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

}