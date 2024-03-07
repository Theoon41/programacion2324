package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;

public class InstrumentoMadera extends JugueteMadera{
    private int edadMin;

    public InstrumentoMadera(String marca, String nombre, double precio, String paisOrigen, int anno, int edadMin) throws JugueteException {
        super(marca, nombre, precio, paisOrigen, anno);
        setEdadMin(edadMin);
    }

    public int getEdadMin() {
        return edadMin;
    }

    private void setEdadMin(int edadMin) throws JugueteException {
        if(edadMin < 1){
            throw new JugueteException("Valor incorrecto, para la edad");
        }
        this.edadMin = edadMin;
    }
}
