package Boletin5_1.ejercicio1;

public class        CuentaCredicto extends Cuenta {
    public static final double CREDITO_BASE = 100;
    public static final double CREDITO_MAXIMO = 300;
    private double credito;
    private final double creditoLimiteCliente;

    public CuentaCredicto(){
        this.credito = CREDITO_BASE;
        creditoLimiteCliente = credito;
    }

    public CuentaCredicto(double credito) throws CuentaException {
        setCredito(credito);
        this.creditoLimiteCliente = credito;
    }

    public CuentaCredicto(double saldo, double credito) throws CuentaException {
        super(saldo);
        setCredito(credito);
        this.creditoLimiteCliente = credito;
    }

    public double getCredito() {
        return credito;
    }

    private void setCredito(double credito) throws CuentaException{
        if (credito > CREDITO_MAXIMO){
            throw new CuentaException("El credito maximo no puede ser tan grande.");
        }
        if (credito < 0){
            throw new CuentaException("El crédito es inferior a 0. No es un valor valido.");
        }
        this.credito = credito;
    }

    @Override
    public void ingresarDinero(double ingreso) throws CuentaException {
        if (ingreso <= 0){
            throw new CuentaException("Introduzca una cantidad positiva");
        }
        if (credito < creditoLimiteCliente) {
            double diferenciaCredito = creditoLimiteCliente - credito;
            if (diferenciaCredito <= ingreso) {
                ingreso -= diferenciaCredito;
                credito = creditoLimiteCliente;
            } else {
                credito += ingreso;
                ingreso = 0;
            }
        }
        if (ingreso > 0){
            super.ingresarDinero(ingreso);
        }
    }

    @Override
    public void sacarDinero(double retiro) throws CuentaException {
        if (getSaldo() + credito < retiro){
            throw new CuentaException("Esta intentando sacar más de lo que tiene permitido");
        }
        if (retiro > getSaldo()){
            if (getSaldo() > 0) {
                retiro -= getSaldo();
                super.sacarDinero(getSaldo());
            }
            credito -= retiro;
        }else{
            super.sacarDinero(retiro);
        }
    }
}
