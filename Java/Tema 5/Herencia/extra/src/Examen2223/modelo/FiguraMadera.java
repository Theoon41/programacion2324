package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;
import Examen2223.interfaces.Apilable;

public class FiguraMadera extends JugueteMadera implements Apilable {
    private String color;
    private int numLados;

    public FiguraMadera(String marca, String nombre, double precio, String paisOrigen, int anno, String color, int numLados) throws JugueteException {
        super(marca, nombre, precio, paisOrigen, anno);
        this.color = color;
        setNumLados(numLados);
    }

    public void setNumLados(int numLados) throws JugueteException {
        if (numLados < 2){
            throw new JugueteException("El numero de lados es demasiado bajo");
        }
        this.numLados = numLados;
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se han apilado el juguete " + juguete.getNombre() + " sobre el juguete " + this.getNombre());
    }
}
