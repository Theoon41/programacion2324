package Boletin5_1.ejercicio6.ejercicio3;

public class Personaje {
    public static final int PUNTOS_VIDA_MAXIMOS = 100;
    public static final int PUNTOS_VIDA_MINIMOS = 0;
    public static final int FUERZA_MAXIMA = 20;
    public static final int FUERZA_MINIMA = 0;
    public static final int INTELIGENCIA_MAXIMA = 20;
    public static final int INTELIGENCIA_MINIMA = 0;

    private Raza raza;
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int vidaActual;
    private int vidaMaxima;

    public Personaje(String nombre, Raza raza, int fuerza, int inteligencia, int vida) throws PersonajeException {
        this.nombre = nombre;
        this.raza = raza;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMaxima(vida);
        setVidaActual(vidaMaxima);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < FUERZA_MINIMA || fuerza > FUERZA_MAXIMA){
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MINIMA || inteligencia > INTELIGENCIA_MAXIMA){
            throw new PersonajeException("Valor de inteligencia no permitido");
        }
        this.inteligencia = inteligencia;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual){
        if (vidaActual < PUNTOS_VIDA_MINIMOS){
            this.vidaActual = PUNTOS_VIDA_MINIMOS;
        }else if (vidaActual > vidaMaxima){
            this.vidaActual = vidaMaxima;
        }else {
            this.vidaActual = vidaActual;
        }
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) throws PersonajeException {
        if (vidaMaxima < PUNTOS_VIDA_MINIMOS || vidaMaxima > PUNTOS_VIDA_MAXIMOS){
            throw new PersonajeException("Valor de vida maxima fuera de rango");
        }
        this.vidaMaxima = vidaMaxima;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personaje{");
        sb.append("raza = ").append(raza);
        sb.append(", nombre = '").append(nombre).append('\'');
        sb.append(", fuerza = ").append(fuerza);
        sb.append(", inteligencia=").append(inteligencia);
        sb.append(", vida = ").append(vidaActual);
        sb.append(" / ").append(vidaMaxima);
        sb.append('}');
        return sb.toString();
    }
}
