package Boletin5_1.ejercicio1;

public class Cuenta {
    private double saldo;
    private static final double SALDO_BASE = 0;

    public Cuenta (){
        this.saldo = SALDO_BASE;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double ingreso) throws CuentaException {
        if (ingreso <= 0){
            throw new CuentaException("Debe introducir una cantidad positiva.");
        }
        saldo += ingreso;
    }

    public void sacarDinero(double retiro) throws CuentaException {
        if (retiro <= 0){
            throw new CuentaException("Debe retirar una cantidad positiva.");
        }
        if (retiro > saldo){
            throw new CuentaException("Esta tratando de retirar más de lo que tiene. Su saldo actual es de: " + saldo);
        }
        saldo -= retiro;
    }
}
