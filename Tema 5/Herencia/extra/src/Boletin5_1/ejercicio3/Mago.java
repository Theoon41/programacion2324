package Boletin5_1.ejercicio3;

import java.util.Arrays;

public class Mago extends Personaje {
    public static final int INT_MIN_MAGO = 17;
    public static final int STR_MAX_MAGO = 15;
    public static final int DMG_HECHIZO = 10;
    public static final int NUM_MAXIMO_HECHIZOS = 4;
    private String[] hechizos;

    public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int vida) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vida);
        hechizos = new String[NUM_MAXIMO_HECHIZOS];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > STR_MAX_MAGO) {
            throw new PersonajeException("El valor de fuerza es demasiado alto");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INT_MIN_MAGO) {
            throw new PersonajeException("El valor de inteligencia es muy bajo");
        }
        super.setInteligencia(inteligencia);
    }

    public void aprenderHechizo(String hechizo) throws PersonajeException {
        int posNula = -1;
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizo.equals(hechizos[i])) {
                throw new PersonajeException("El hechizo " + hechizo + " ya ha sido aprendido por el mago.");
            }
            if (hechizos[i] == null && posNula == -1) {
                posNula = i;
            }
        }
        if (posNula == -1) {
            throw new PersonajeException("El mago no puede aprender más hechizos.");
        }
        hechizos[posNula] = hechizo;
    }

    public void lanzarHechizo(String hechizo, Personaje personaje) throws PersonajeException {
        int posHechizo = -1;
        for (int i = 0; i< hechizos.length && posHechizo == -1; i++){
            if (hechizo.equals(hechizos[i])){
                posHechizo = i;
            }
        }
        if (posHechizo == -1){
            throw new PersonajeException("El hechizo no lo tiene aprendido el mago.");
        }
        if (this == personaje){
            throw new PersonajeException("No puedes atacarte a ti mismo.");
        }
        if (personaje.getVidaActual() == 0){
            throw new PersonajeException("Ha muerto ya.");
        }
        personaje.setVidaActual(personaje.getVidaActual()-DMG_HECHIZO);
        hechizos[posHechizo] = null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mago{");
        sb.append("hechizos=").append(Arrays.toString(hechizos));
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
