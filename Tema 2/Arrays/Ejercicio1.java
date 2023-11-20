public class Ejercicio1 {
    public static void main(String[] args) {
        int[] num={2,23,1,4,75,4,13,46,89,32};
        int suma = 0;
        for (int i = 0; i<num.length; i++){
            if (i % 2 == 0){
                suma += num[i];
            }
        }
        System.out.printf("La suma de las posiciones pares es %d", suma);
    }
}
