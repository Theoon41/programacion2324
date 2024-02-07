package Boletin5_1.ejercicio2;

public enum Gamma {
    BAJA(30), MEDIA(40), ALTA(50);
    private double precioDia;

    Gamma(double precioDia) { this.precioDia = precioDia; }

    public double getPrecioDia() { return precioDia; }
}
