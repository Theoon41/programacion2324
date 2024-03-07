public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println(valorPosion(4,4,6));
    }
    public static int valorPosion(int a, int b, int c){
        int posicion= a*c + b + 1;
        return posicion;
    }
}
