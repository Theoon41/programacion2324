package Boletin5_2.ejercicio2;

public class Linea extends Forma {
    @Override
    public String calcularArea() throws LineaException{
        throw new LineaException("No se puede calcular el area de una linea");
    }
}
