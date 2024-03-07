package Boletin5_1.ejercicio2;

public class Coche extends Vehiculo{
    private Combustible combustible;


    public Coche(String matricula, Gamma gama, Combustible combustible) {
        super(matricula, gama);
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    @Override
    public double getPrecioBase() {
        return getGama().getPrecioDia() + getCombustible().getPrecioCombustible();
    }
}
