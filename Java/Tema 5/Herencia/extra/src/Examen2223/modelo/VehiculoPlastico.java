package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;

public class VehiculoPlastico extends JuguetePlastico{
    private int numRuedas;

    public VehiculoPlastico(String marca, String nombre, double precio, int numRuedas) throws JugueteException {
        super(marca, nombre, precio, TPlastico.PVC);
        setNumRuedas(numRuedas);
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) throws JugueteException {
        if(numRuedas < 1){
            throw new JugueteException("No tiene sentido tan pocas ruedas");
        }
        this.numRuedas = numRuedas;
    }
}
