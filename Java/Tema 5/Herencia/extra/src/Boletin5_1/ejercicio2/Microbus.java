package Boletin5_1.ejercicio2;

public class Microbus extends Vehiculo{
    private int numPlazas;
    private static final int PRECIO_PLAZA = 5;

    public Microbus(String matricula, Gamma gama, int numPlazas) throws VehiculoException {
        super(matricula, gama);
        setNumPlazas(numPlazas);
    }

    private void setNumPlazas(int numPlazas) throws VehiculoException {
        if(numPlazas<1){
            throw new VehiculoException("El numero de plazas no puede ser inferior a 1");
        }
        this.numPlazas = numPlazas;
    }

    @Override
    public double getPrecioBase() {
        return getGama().getPrecioDia() + numPlazas * PRECIO_PLAZA;
    }
}
