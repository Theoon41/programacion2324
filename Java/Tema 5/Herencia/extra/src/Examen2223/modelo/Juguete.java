package Examen2223.modelo;

import Examen2223.excepciones.JugueteException;

public abstract class Juguete {
    private String marca;
    private String nombre;
    private double precio;

    public Juguete(String marca, String nombre, double precio) throws JugueteException{
        this.marca = marca;
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws JugueteException {
        if(precio < 1){
            throw new JugueteException("El precio debe ser positivo");
        }
        this.precio = precio;
    }
}
