package EjercicioRandom;

public class Deposito {
    public double capacidadGasolina;
    private double cantidadActual;

    public Deposito(double capacidadGasolina, double cantidadActual) {
        this.capacidadGasolina = capacidadGasolina;
        this.setCantidadActual(cantidadActual);
    }

    public void setCantidadActual(double cantidadActual) {
        if (cantidadActual < capacidadGasolina && cantidadActual > 0) {
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
    @Override
    public String toString(){
        return cantidadActual/capacidadGasolina*100 + "% de un depósito de " + capacidadGasolina;
    }
}
