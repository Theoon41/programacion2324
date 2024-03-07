public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num={2,23,-1,4,75,4,-13,46,-89,32};
        int cont = 0;
        for (int i : num) {
            if (i < 0) {
                cont++;
            }
        }
        System.out.printf("Hay un total de %d numeros negativos", cont);
    }
}