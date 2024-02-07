package Boletin5_1.ejercicio2;

import app.MiEntradaSalida;
import java.util.Scanner;

public class EmpresaAlquiler {
    private static final int MAX_VEHICULOS = 200;
    private static final Vehiculo[] listaVehiculos = new Vehiculo[MAX_VEHICULOS];
    private static int vehiculoAlta = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int op;
        do{
            menu();
            op = sc.nextInt();

            switch (op){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Adios");
            }
        }while(op != 3);
    }

    public static void darDeAltaVehiculo(){
        System.out.println("Estos son los vehiculos de los que disponemos: ");
        int selecUsuario;
        int op = 1;
        for (TipoVehiculo t:TipoVehiculo.values()){
            System.out.println(op++ + "." + String.valueOf(t).toLowerCase());
        }
        selecUsuario = MiEntradaSalida.leerEnteroDeRango("Selecciona un vehiculo: ", 1, TipoVehiculo.values().length);

        switch (selecUsuario){
            case 1:
            case 2:
            case 3:
        }
    }

    public static void listaVehiculos(){
        for (int pos = 0; pos < vehiculoAlta; pos++){

        }
    }

    private static void calculoPrecio(){
        int posVehiculo;

        String matricula = sc.nextLine().toUpperCase();
        int dias = MiEntradaSalida.leerEnteroDeRango("Introduce el numero de dias que deseas alquilarlo", 1, 365);

        for(posVehiculo = 0; posVehiculo<vehiculoAlta; posVehiculo++) {
            if (listaVehiculos[posVehiculo].getMatricula().equals(matricula)) break;
        }

    }
    public static void menu(){
        System.out.println("""
                Escoge una opcion:
                1. Alta de vehiculo.
                2. Calculo de precio de alquiler.
                3. Lista de vehiculos.
                4. Salir.""");
    }
}
