package Boletin5_1.ejercicio2;

public enum Combustible {
    DIESEL(2), GASOLINA(3.5);
    private double precioCombustible;

    Combustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }
    public double getPrecioCombustible() {
        return precioCombustible;
    }
}
