import java.util.Scanner;

public class Ejercicio5 {
    static Scanner tc = new Scanner(System.in);
    static int money = 4000;
    static String arma = "Espada de Ragnar";
    static int lvl = 48;
    static double salud = 4823;

    public static void main(String[] args) {
        System.out.println("Cuanta vida has perdido");
        double a = Double.parseDouble(tc.nextLine());
        salud =  damage (a);
        statement(money, arma, lvl, salud);
    }
    public static double damage (double a){
        return (salud - a);
    }
    public static  void statement (int a, String b, int c, double d){
        System.out.printf("Tu nivel es %d.\nTienes %d dinero.\nEl arma equipada es %s.\nTu salud actual es %.2f\n", c, a, b, d);
    }
}