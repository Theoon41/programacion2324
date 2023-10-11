import java.util.Scanner;

public class Ejercicio4 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        double km, vel;
        int horas, min, seg;
        System.out.print("Dime a que distancia estas de tu destino: ");
        km = Double.parseDouble(tc.nextLine());
        System.out.print("\nDime la velocidad a la que vas: ");
        vel = Double.parseDouble(tc.nextLine());
        double tiempo = km/vel;
        System.out.println(tiempo);
        horas = (int) tiempo;
        min = (int) ((tiempo-horas)*60);
        seg = (int)(((tiempo*60) - (horas * 60) - min)*60);
        System.out.printf("%d:%d:%d", horas, min, seg);
        tc.close();
    }
}