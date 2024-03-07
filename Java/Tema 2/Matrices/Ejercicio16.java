public class Ejercicio16 {
    public static void main(String[] args) {
        int [][] prueba = {{1234},{2234},{7658},{1234}};
        imprimirMatriz(recorrerMatriz(prueba));
    }
    public static int [][] recorrerMatriz(int [][]a){
        int cont = 0;
        int[][] resultados = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 0) { // El valor actual es par
                    if (i > 0) {
                        resultados[i - 1][j]++;
                    }
                    if (j > 0) {
                        resultados[i][j - 1]++;
                    }
                    if (i < a.length - 1) {
                        resultados[i + 1][j]++;
                    }
                    if (j < a[i].length - 1) {
                        resultados[i][j + 1]++;
                    }
                }
            }
        }
        return resultados;
    }
    public static void imprimirMatriz (int [][]a){
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}
