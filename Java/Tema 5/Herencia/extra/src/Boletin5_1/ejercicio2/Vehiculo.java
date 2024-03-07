package Boletin5_1.ejercicio2;

public abstract class Vehiculo {
    private String matricula;
    private Gamma gama;
    private double precioBase;

    public Vehiculo(String matricula, Gamma gama) {
        this.matricula = matricula;
        this.gama = gama;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setGama(Gamma gama) {
        this.gama = gama;
    }

    public String getMatricula() {
        return matricula;
    }

    public Gamma getGama() {
        return gama;
    }



    public abstract double getPrecioBase();

    public double getPrecioAlquiler (int numDias){
        return getPrecioBase() * numDias;
    }

}
