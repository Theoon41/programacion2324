package Boletin5_2.ejercicio2;

public class Rectángulo extends Forma implements Dibujable {
    private double ancho;
    private double alto;

    public Rectángulo(double ancho, double alto) throws RectanguloException {
        setAncho(ancho);
        setAlto(alto);
    }

    public void setAncho(double ancho) throws RectanguloException {
        if(ancho <= 0){
            throw new RectanguloException("Introduce un valor mayor que 0.");
        }
        this.ancho = ancho;
    }

    public void setAlto(double alto) throws RectanguloException {
        if(alto <= 0){
            throw new RectanguloException("Introduce un valor mayor que 0.");
        }
        this.alto = alto;
    }

    public double getAncho(double ancho) {
        return ancho;
    }

    public double getAlto(double alto) {
        return alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo");
    }

    @Override
    public String calcularArea() {
        return "El area del rectangulo es " + alto*ancho;
    }
}