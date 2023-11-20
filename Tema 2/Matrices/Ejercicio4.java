public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matriz = {{3,4,1,2},{3,1,4,1},{1,0,7,5}};
        System.out.print("La salida es: ");
        lecturaPorFilas(matriz);
    }
    public static void lecturaPorFilas(int[][] a){
        for (int i=(a.length-1); i>=0; i--){
            for(int j=(a[i].length-1); j>=0; j--){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}