package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;
import Examen2223.interfaces.Apilable;

public class PiezaLego extends JuguetePlastico implements Apilable {
    private int longitud;
    private String color;

    public PiezaLego(String marca, String nombre, double precio,  int longitud, String color) throws JugueteException {
        super(marca, nombre, precio, TPlastico.ABS);
        setLongitud(longitud);
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    public void setLongitud(int longitud) throws JugueteException {
        if(longitud < 1){
            throw new JugueteException("Valor de longitud invalido");
        }
        this.longitud = longitud;
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se han apilado el juguete " + juguete.getNombre() + " sobre el juguete " + this.getNombre());
    }
}
