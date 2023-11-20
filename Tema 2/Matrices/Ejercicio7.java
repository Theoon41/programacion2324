public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matrizA = {{2, 4}, {1, 2}};
        int[][] matrizB = {{2, 4}, {1, 2}};


        if (sonIguales(matrizA, matrizB)) {
            System.out.println("Las matrices son iguales");

        } else {
            System.out.println("No coinciden los valores");
        }

    }
        public static boolean sonIguales (int[][] a, int[][] b){
        boolean iguales = false;
        if (a.length==b.length && a[0].length==b[0].length){
            for (int i=0; i<a.length; i++){
                for (int j=0; j<a[i].length; j++){
                    iguales = a[i][j] == b[i][j];
                }
            }

        }
        return iguales;
    }
}
