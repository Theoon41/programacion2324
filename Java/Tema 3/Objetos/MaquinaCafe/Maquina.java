package MaquinaCafe;

public class Maquina {
    private static final int CAP_MAX_CAFE = 50;
    private static final int  CAP_MAX_LECHE = 50;
    private static final int CAP_MAX_VASOS = 80;
    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_CON_LECHE = 1.5;
    private static final double MONEDERO_INICIAL = 5;

    public int cantidadCafe;
    public int cantidadLeche;
    public int cantidadVasos;
    public double monedero;


    public Maquina() {
        rellenar();
        monedero = MONEDERO_INICIAL;
    }

    public void rellenar(){
        cantidadCafe = CAP_MAX_CAFE;
        cantidadLeche = CAP_MAX_LECHE;
        cantidadVasos = CAP_MAX_VASOS;
    }
    public boolean puedoServirCafe(){
        return cantidadCafe > 0 && cantidadVasos > 0;
    }
    public boolean puedoServirLeche(){
        return cantidadLeche > 0 && cantidadVasos > 0;
    }
    public boolean puedoServirCafeConLeche(){
        return cantidadCafe > 0 && cantidadLeche > 0 && cantidadVasos > 0;
    }

    public String darCambio(double pago, double precio) throws MaquinaException {
        double cambio = pago - precio;

        if (pago == precio){
            monedero = monedero + precio;
            return "Gracias por su compra.";
        }else if (pago > precio && monedero >= cambio){
            monedero = monedero + precio;
            return String.format("Aquí tiene su cambio " + cambio);
        }else if (precio > pago){
           throw new MaquinaException("Pago insuficiente.");
        }else {
            throw new MaquinaException("No hay cambio");
        }
    }
    public void servirCafe(){
        cantidadCafe--;
        cantidadVasos--;
    }
    public void servirLeche(){
        cantidadLeche--;
        cantidadVasos--;
    }
    public void servirCafeConLeche(){
        cantidadCafe--;
        cantidadLeche--;
        cantidadVasos--;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Maquina{");
        sb.append("cantidadCafe=").append(cantidadCafe);
        sb.append(", cantidadLeche=").append(cantidadLeche);
        sb.append(", cantidadVasos=").append(cantidadVasos);
        sb.append(", monedero=").append(monedero);
        sb.append('}');
        return sb.toString();
    }
}
