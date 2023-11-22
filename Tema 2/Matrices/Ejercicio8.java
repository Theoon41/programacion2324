public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matrizA = {{2, 9}, {1, 2}};
        int[][] matrizB = {{2, 9}, {1, 2}};

        imprimirMatriz((matrizSuma(matrizA, matrizB)));
    }

    public static int[][] matrizSuma(int[][] a, int[][] b) {
        int[][] suma = new int[a.length][a[0].length];
        boolean iguales = a.length == b.length;

        for (int i = 0; iguales && i < a.length; i++) {
            iguales = a[i].length == b[i].length;
            for (int j = 0; iguales && j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        if (iguales) {
            return suma;
        } else {
            return new int[][]{new int[]{0}};
        }
    }
    public static void imprimirMatriz (int [][]a){
        for (int j=(a[0].length-1); j>=0; j--){
            System.out.println();
            for(int i=(a.length-1); i>=0; i--){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}