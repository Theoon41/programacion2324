public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{3,4,1,2},{3,1,4,1},{1,0,7,5}};
        System.out.println(suma(matriz));
    }
    public static int suma(int[][] a){
        int resultado=0;
        for (int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                resultado+=a[i][j];
            }
        }
        return resultado;
    }
}
