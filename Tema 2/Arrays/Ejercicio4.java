import java.util.Random;

public class Ejercicio4 {
    static final int NUM_REPETICIONES = 10;
    public static void main(String[] args) {

        int[] miArray = new int [10];

        double suma = 0;
        Random rnd = new Random();

        for (int i = 0; i<NUM_REPETICIONES; i++){
            int rand =rnd.nextInt(100);
            suma += rand;
            miArray [rand % 10]++;
        }
        System.out.printf("La media de los numeros es: %f\n", suma/NUM_REPETICIONES);

        //Busca el número que más se repite en un array
        int maxValue = Integer.MIN_VALUE;
        for (int j : miArray) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        //Imprime por pantalla los números que más se repiten en caso de que hubiese más de uno
        for(int i=0; i<miArray.length;i++){
            if (miArray[i]==maxValue){
                System.out.printf("Los números que más se repiten son: %d. Un total de %d veces\n", i, maxValue);
            }
        }


        //Busca el número que menos veces se repite en el array
        int posMin = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i<miArray.length; i++){
            if( miArray[i] < minValue){
                minValue = miArray[i];
                posMin = i;
            }
        }
        System.out.printf("La numero que menos se repite es: %d\n", posMin);

        //Voy a mostrar el número de veces que se repite cada número.
        for(int i=0; i<miArray.length; i++){
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale al %2f%%\n",i,miArray[i],(double)miArray[i]*100/NUM_REPETICIONES);
        }
        //Mostrará por mantalla los números que no aparezcan
        for(int i=0; i<miArray.length;i++){
            if (miArray[i]==0){
                System.out.printf("El numero que %d no se ha repetido.\n", i);
            }
        }
    }
}