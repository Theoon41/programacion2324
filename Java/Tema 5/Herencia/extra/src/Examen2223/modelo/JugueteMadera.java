package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;

public abstract class JugueteMadera extends Juguete{
    private String paisOrigen;
    private int anno;

    public JugueteMadera(String marca, String nombre, double precio, String paisOrigen, int anno) throws JugueteException {
        super(marca, nombre, precio);
        this.paisOrigen = paisOrigen;
        setAnno(anno);
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) throws JugueteException {
        if (anno < 1){
            throw new JugueteException("Fecha incorrecta");
        }
        this.anno = anno;
    }
}
