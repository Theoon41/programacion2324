package Boletin5_1.ejercicio1;

import java.util.Scanner;

public class MenuCuentaCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCredicto miCuenta = new CuentaCredicto();
        int op;
        do{
            menu();
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Cuanto dinero desea ingresar");
                    double ingreso = sc.nextDouble();
                    try {
                        miCuenta.ingresarDinero(ingreso);
                    } catch (CuentaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println(" Cuanto dinero desea retirar");
                    double retiro = sc.nextDouble();
                    try {
                        miCuenta.sacarDinero(retiro);
                    } catch (CuentaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Su saldo disponible es: "+ miCuenta.getSaldo() + " y Su credito disponibles es :" + miCuenta.getCredito());
                    break;
                case 4:
                    System.out.println("Adios");

            }

        }while (op != 4);
    }

    public static void menu (){
        System.out.println( "Bienvenido. ¿Que operacion desea hacer?");
        System.out.println( "1. Ingresar dinero");
        System.out.println( "2. Sacar dinero");
        System.out.println( "3. Mostrar saldo y crédito");
        System.out.println( "4. Salir");
    }
}

