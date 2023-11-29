

import java.util.Scanner;

public class Cuenta {
    public static Scanner tc = new Scanner(System.in);
    public double saldo;
    private int numIngreso;
    private int contadorIngresos = 0;
    private double valorIngresos = 0;
    private int numRetiro;
    private double valorReintegros = 0;
    private int contadorReintegros = 0;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void ingresarDinero() {
        System.out.println("Indique la cantidad a ingresar\n");
        numIngreso = tc.nextInt();
        saldo += numIngreso;
        valorIngresos += numIngreso;
        contadorIngresos++;
    }

    public void retirarDinero() {
        System.out.println("Indique la cantidad a retirar\n");
        numRetiro = tc.nextInt();
        if (saldo - numRetiro > 0) {
            saldo -= numRetiro;
            valorReintegros += numRetiro;
            contadorReintegros++;
        } else {
            System.out.println("El dinero excede la cantidad que tienes en el banco.\n");
            System.out.printf("%f", saldo);
        }
    }

    public void consultaEstadoCuenta() {
        System.out.printf("El saldo actual de la cuenta es de %f.", saldo);
        System.out.printf("Has realizado un total de %d ingresos por valor de %f.Has realizado un total de %d reintegros por valor de %f", contadorIngresos, valorIngresos, contadorReintegros, valorReintegros, "\n");
    }
}
