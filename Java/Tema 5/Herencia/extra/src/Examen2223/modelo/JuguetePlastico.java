package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;

public abstract class JuguetePlastico extends Juguete{
    private TPlastico tPlastico;

    public JuguetePlastico(String marca, String nombre, double precio, TPlastico tPlastico) throws JugueteException {
        super(marca, nombre, precio);
        this.tPlastico = tPlastico;
    }

    public TPlastico gettPlastico() {
        return tPlastico;
    }
}
