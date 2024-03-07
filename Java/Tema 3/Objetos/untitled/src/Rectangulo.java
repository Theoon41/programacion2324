package untitled.src;

public class Rectangulo {
    public static final double MAX_LONGITUD_ANCHO = 20;
    private double longitud;
    private double ancho;

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5, 2);
        System.out.printf("El área del rectángulo es %f\n y su perimetro es %f\n", r.getArea(), r.getPerimetro());
    }

    public Rectangulo(double l, double a) {
        setLongitud(l);
        setAncho(a);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0 && longitud < MAX_LONGITUD_ANCHO) {
            this.longitud = longitud;
        } else {
            //TODO: Lanzar excepción
            System.out.println("Error. Valor fuera del rango");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (longitud > 0 && ancho < MAX_LONGITUD_ANCHO) {
            this.ancho = ancho;
        } else {
            //TODO: Lanzar excepción
            System.out.println("Error. Valor fuera del rango");
        }
    }

    public double getPerimetro() {
        return 2 * longitud + 2 * ancho;
    }

    public double getArea() {
        return longitud * ancho;
    }
}
