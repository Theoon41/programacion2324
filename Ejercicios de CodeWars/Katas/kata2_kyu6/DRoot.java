package Katas.kata2_kyu6;

public class DRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(132189));
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(493193));
    }
    public static int digital_root(int n) {
        int sumador = 0;
        int num = n;
        int contador = 0;
        while (num>0){
            num = num/10;
            contador++;
        }
        num = n;
        for (int i = 1; i <= contador; i++){
            sumador += (int) (num/(Math.pow(10, contador-i)));
            num = (int) (num%(Math.pow(10, contador-i)));
        }
        if (sumador>9){
            sumador = digital_root(sumador);
        }
        return sumador;
    }
}