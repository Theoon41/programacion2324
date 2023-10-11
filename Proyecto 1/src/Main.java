import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
   /* public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dame una palabra");
        String palabra1 = teclado.nextLine();
        System.out.println("dame otra palabra");
        String palabra2 = teclado.nextLine();
        System.out.println(palabra1 + " " + palabra2);
    }*/
    public static void main(String[]args){
        saludar("Manolo");
        saludar(55);
        int a = 33;
        saludar(a);
        saludar(a, 9);

    }
    public static int saludar (int a, int b){
        return a + b;
    }
    public static void  saludar(String name) {
        System.out.println("Hola " + name);
    }
}