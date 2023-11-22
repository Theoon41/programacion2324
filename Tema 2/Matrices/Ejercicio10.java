public class Ejercicio10 {
    public static void main(String[] args) {

    }

    public static boolean simetricaPorColumnas(int[][] a) {
        boolean simetriaY = true;
        //Recorrido por filas
        for (int i = 0; simetriaY && i < a.length; i++) {
            for (int j = 0; simetriaY && j < a[i].length / 2; j++) {
                simetriaY = a[i][j] == a[i][a[i].length - j - 1];
            }
        }
        //Recorrido por columnas
        for (int j = 0; simetriaY && j < a[0].length / 2; j++) {
            for (int i = 0; simetriaY && i < a.length; i++) {
                simetriaY = a[i][j] == a[i][a[i].length - j - 1];
            }
        }
        return simetriaY;
    }
}
