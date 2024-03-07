package Boletin5_1.ejercicio2;

public class Furgoneta extends Vehiculo{
    private int pma;
    private static final double PRECIO_KILO = 0.5;

    public Furgoneta(String matricula, Gamma gama, int pma) throws VehiculoException{
        super(matricula, gama);
        setPma(pma);
    }
    private void setPma (int pma) throws VehiculoException {
        if (pma < 1){
            throw new VehiculoException("PMA invalido.");
        }
        this.pma = pma;
    }

    @Override
    public double getPrecioBase() {
        return getGama().getPrecioDia() + pma * PRECIO_KILO;
    }
}
