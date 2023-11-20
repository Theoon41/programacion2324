import app.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio14 {
    public static final int TAM_COLA=4;
    public static int[] pila= new int [TAM_COLA];

    public static int primerElemento =0;
    public static int numElementos=0;
    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 4) {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce una opción", 1, 3);

            switch (opcion) {
                case 1 -> {
                    int num = MiEntradaSalida.leerEntero("Introduce un número");
                    encolar(num);
                }
                case 2 -> {
                    int numDesapilado = desencolar();
                    System.out.println("Has desencolado el número " + numDesapilado);
                }
                case 3 -> {
                    mostrar();
                }
                case 4 -> System.out.println("Adiós");
                default -> System.out.println("Elige una opción válida");
            }
        }
    }
    public static void menu() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1) Encolar");
        System.out.println("2) Desencolar");
        System.out.println("3) Mostrar");
        System.out.println("4) Salir");
    }
    public static void mostrar(){
        System.out.println(Arrays.toString(pila));
        System.out.printf("Mi principio de la cola está en la posición %d", primerElemento);
    }
    public static void encolar(int num){
        if (numElementos!=TAM_COLA){
            pila[(numElementos+primerElemento)%TAM_COLA]=num;
            numElementos++;
        }else{
            primerElemento++;
            System.out.println("No se pueden encolar más elementos");
        }

    }
    public static int desencolar(){
        if (numElementos!=0){
            numElementos--;
        }
        return pila[primerElemento];
    }

}
