import java.util.Scanner;

public class BucleDoWhile {
    static Scanner teclado;

    public BucleDoWhile() {
    }

    public static void main(String[] args) {
        String contrasena = "Ey";

        do {
            System.out.println("Introduce una contraseña valida.");
            contrasena = teclado.nextLine();
        } while(contrasena.length() < 8);

        System.out.println("Contraseña correcta");
    }

    static {
        teclado = new Scanner(System.in);
    }
}