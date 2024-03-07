public class Ejercicio12 {
    public static void main(String[] args) {

    }
    public static boolean cuadrada(int [][]a){
        boolean iguales = true;
        for (int i=0; i<a.length; i++){
            iguales = a.length == a[i].length;
        }
        return iguales;
    }
    public static int [][] inversaDiagonal(int [][]a){
        if (!cuadrada(a)){
            return null;
        }
        int [][] matrizInversaDiagonal = new int [a.length][a[0].length];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                matrizInversaDiagonal[i][j] = a[j][i];
            }
        }
        return matrizInversaDiagonal;
    }
}
