package Boletin5_2.ejercicio2;

public class CirculoMovible extends Forma implements Dibujable, Animable{
    private double radio;

    public CirculoMovible(double radio) throws CirculoException {
        setRadio(radio);
    }

    public void setRadio(double radio) throws CirculoException {
        if (radio <= 0){
            throw new CirculoException("El valor del radio tiene que ser mayor que 0");
        }
        this.radio = radio;
    }
    @Override
    public void animar() {
        System.out.println("Animando circulo movible");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo movible");
    }

    @Override
    public String calcularArea() {
        return "El area del circulo es" + 2*Math.PI*radio;
    }
}
