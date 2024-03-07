public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {{3,4,1,2},{3,1,4,1},{1,0,7,5}};
        System.out.print("La salida es: ");
        lecturaPorFilas(matriz);
    }
    public static void lecturaPorFilas(int[][] a){
        for (int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}