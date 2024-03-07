import java.util.Scanner;

public class Ejercicio9 {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        String prod;
        double valor;
        do {
            System.out.println("Introduce el producto escogido");
            prod = String.valueOf(tc.nextLine().toUpperCase().charAt(0));
        }while (!prod.equals("A") && !prod.equals("B") && !prod.equals("C"));
        do {
            System.out.println("Introduce el precio del producto");
            valor = tc.nextInt();
        }while (valor<=0);

        double desc1 = 0.7, desc2 = 1.2, desc3 = 0.9;
        double precio;

        if (prod.equals('A')){
            precio = valor - (valor+desc1);
            System.out.printf("El precio del producto es de %d", precio);
        }if (prod.equals('C')||valor<500){
                precio = valor - (valor+desc2);
                System.out.printf("El precio del producto es de %d", precio);
        }else{
            precio = valor - (valor+desc3);
            System.out.printf("El precio del producto es de %d", precio);
        }
    }
}
