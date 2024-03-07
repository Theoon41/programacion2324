import java.util.Scanner;

public class Ejercicio3 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int numP;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int contMax=1, contMin=1;
        double suma=0;

        do {
            System.out.println("Dime el numero de posiciones que tendrá el array");
            numP = tc.nextInt();
        } while (numP < 1);

        int[] num = new int[numP];

        for (int i = 0; i < numP; i++) {
            System.out.printf("Posición %d del array: ", i);
            num[i] = tc.nextInt();
            if (num[i] >= max) {
                if (num[i]==max){
                    contMax++;
                }else{
                    max = num[i];
                    contMax = 1;
                }

            }
            if (num[i] <= min){
                if (num[i]==min){
                    contMin++;
                }else{
                    min = num[i];
                    contMin = 1;
                }
            }
            suma += num[i];
        }

        System.out.printf("El mayor valor es: %d. Se repite %d veces.\n", max, contMax);
        System.out.printf("El menor valor es: %d. Se repite %d veces.\n", min, contMin);
        System.out.printf("El media valor es: %f", suma/numP);

        tc.close();
    }
}