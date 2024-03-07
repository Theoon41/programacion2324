public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {{3,4,1,2},{3,1,4,1},{1,0,7,5}};
        System.out.println(negativo(matriz));
    }
    public static boolean negativo(int[][] a){
        for (int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                if (a[i][j]<0){
                    return true;
                }
            }
        }
        return false;
    }
}
