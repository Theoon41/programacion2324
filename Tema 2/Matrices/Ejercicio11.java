public class Ejercicio11 {
    public static void main(String[] args) {

    }

    public static boolean simetricaPorColumnas(int[][] a, int [][]b) {
        boolean simetria = a.length==b.length;

        for (int i=0; simetria && i<a.length; i++){
            simetria = a[i].length==b[a.length-1-i].length;
            for (int j=0; simetria && j<a[i].length;j++){
                simetria = a[i][j] == b[a.length-1-i][a[i].length-1-j];
            }
        }

        return simetria;
    }
}
