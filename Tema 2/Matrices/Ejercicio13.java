import java.util.Arrays;
public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirMatriz(reflejo(matriz));
    }
    public static void imprimirMatriz (int [][]a){
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
    public static boolean cuadrada(int[][]a){
        boolean iguales = true;
        for (int i=0; i<a.length; i++){
            iguales = a.length == a[i].length;
        }
        return iguales;
    }
    public static int [][] reflejo (int [][]a){
        if (!cuadrada (a)){
            return null;
        }
        int[][] matrizReflejo = new int[a.length][a.length];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                matrizReflejo[i][j] = a[a.length-1-j][a.length-1-i];
            }
        }
        return matrizReflejo;
    }
}
