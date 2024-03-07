package Boletin5_2.ejercicio2;

public class Circulo extends Forma implements Dibujable{
    private double radio;

    public Circulo(double radio) throws CirculoException {
        setRadio(radio);
    }

    public void setRadio(double radio) throws CirculoException {
        if (radio <= 0){
            throw new CirculoException("El valor del radio tiene que ser mayor que 0");
        }
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Circulo");
    }

    @Override
    public String calcularArea() {
        return "El area del circulo es" + 2*Math.PI*radio;
    }
}
