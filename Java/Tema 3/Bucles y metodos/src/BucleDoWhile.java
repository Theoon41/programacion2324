import java.util.Scanner;
public class BucleDoWhile {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String contrasena = "Ey";
        do {
            System.out.println("Introduce una contraseña valida.");
            contrasena = teclado.nextLine();
            //System.out.println("Contraseña no valida");

        } while (contrasena.length() < 8);
        System.out.println("Contraseña correcta");
        teclado.close();
    }
}
