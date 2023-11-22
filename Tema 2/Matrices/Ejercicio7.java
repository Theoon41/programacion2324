public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matrizA = {{2, 9}, {1, 2, 9}};
        int[][] matrizB = {{2, 9}, {1, 2}};

        if (sonIguales(matrizA, matrizB)) {
            System.out.println("Las matrices son iguales");

        } else {
            System.out.println("No coinciden los valores");
        }
    }
    public static boolean sonIguales (int[][] a, int[][] b){
        boolean iguales = a.length==b.length;

        for (int i=0; iguales && i<a.length; i++){
            iguales = a[i].length == b[i].length;
            for (int j=0; iguales && j<a[i].length; j++){
                iguales = a[i][j] == b[i][j];
            }
        }
        return iguales;
    }
}
