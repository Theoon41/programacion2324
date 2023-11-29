import Objeto.Cuenta;

import java.util.Scanner;

public class Main {
    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        double saldoInicial = 1000;
        Cuenta c = new Cuenta(saldoInicial);
        int opcion;
        boolean salir = false;
        int siONo = 0;
        do {
            menu();
            do {
                System.out.println("Introduzca la opcion que desea");
                opcion = tc.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1 -> {
                    c.retirarDinero();
                }
                case 2 -> {

                    c.ingresarDinero();
                }
                case 3 -> {
                    c.consultaEstadoCuenta();
                }
                case 4 -> {
                    do {
                        System.out.println("Confirme que desea salir. 1 para salir 2 para continuar.");
                        siONo = tc.nextInt();
                    } while (siONo < 1 || siONo > 2);
                    if (siONo == 1) {
                        salir = true;
                    }
                }

            }

        } while (!salir);
    }

    public static void menu() {
        System.out.println("1. Hacer un retiro.");
        System.out.println("2. Hacer un ingreso.");
        System.out.println("3. Consultar estado de la cuenta.");
        System.out.println("4. Salir");
    }
}