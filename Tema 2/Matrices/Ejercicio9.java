public class Ejercicio9 {
    public static void main(String[] args) {

    }
    public static boolean simetricaPorFilas(int [][] a){
        boolean simetriaX = true;

        for (int i=0; simetriaX && i<a.length/2;i++){
            for(int j=0; simetriaX && j<a[i].length; j++){
                simetriaX = a[i][j] == a[a.length-i-1][j];
            }
        }
        return simetriaX;
    }
}
