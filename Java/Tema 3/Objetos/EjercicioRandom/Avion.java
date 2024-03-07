package EjercicioRandom;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Avion {
    public static final int NUM_MAX_REVISIONES = 10;
    private String marca;
    private String modelo;
    private double consumo;
    private Deposito depositoCombustible;
    private Revision[] revisiones;

    public Avion(String marca, String modelo, double consumo, Deposito depositoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.depositoCombustible = depositoCombustible;
        this.revisiones = new Revision[NUM_MAX_REVISIONES];
    }
    public void addRevision(Revision r){

        for (int i = 0; i<NUM_MAX_REVISIONES; i++){
            if (revisiones[i] == null){
                revisiones[i] = r;
                break;
            }
        }
    }
    public Revision getUltimaRevision(){
        for (int i=NUM_MAX_REVISIONES-1; i>=0; i--){
            if (revisiones[i] != null){
                return revisiones[i];
            }
        }
        return null;
    }
    //medida en km
    public boolean puedeVolar(double distancia){
        Revision ultimaRevision = getUltimaRevision();
        double distanciaAlcanzable = depositoCombustible.getCantidadActual()/consumo;
        if (distanciaAlcanzable>=distancia && ultimaRevision.isApto()
           && ultimaRevision.getFecha().plusMonths(ultimaRevision.getFechaDeValidez()).isAfter(LocalDateTime.now())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Datos del avion. " +
                "Marca: " + marca +
                ", modelo: '" + modelo + '\'' +
                ", tiene un consumo de " + consumo + " litros por kilometros.\n" +
                " La capacidad del deposito es de: " + depositoCombustible +
                ". Su ultima revision fue" + getUltimaRevision();
    }
}
