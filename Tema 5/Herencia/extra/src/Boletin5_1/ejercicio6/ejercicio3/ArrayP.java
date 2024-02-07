package Boletin5_1.ejercicio6.ejercicio3;

import Boletin5_1.ejercicio3.Personaje;

public class ArrayP implements CreableEstadisticas {
    public static final int NUM_MAX_PERSONAJES = 100;
    private Personaje[] personajes;

    public ArrayP() {
        this.personajes = new Personaje[NUM_MAX_PERSONAJES];
    }

    @Override
    public double minimo() throws PersonajeException {
        double valorVidaMin = Personaje.PUNTOS_VIDA_MAXIMOS;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                if (valorVidaMin > personajes[i].getVidaActual()) {
                    valorVidaMin = personajes[i].getVidaActual();
                }
            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVidaMin;
    }

    @Override
    public double maximo() throws PersonajeException {
        double valorVidaMax = Personaje.PUNTOS_VIDA_MINIMOS;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                if (valorVidaMax < personajes[i].getVidaActual()) {
                    valorVidaMax = personajes[i].getVidaActual();
                }
            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVidaMax;
    }

    @Override
    public double media() throws PersonajeException {
        double valorVida = 0;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                cont++;
                valorVida += personajes[i].getVidaActual();
            }
        }
        if (cont == 0){
            throw new PersonajeException("No hay personajes guardados");
        }
        return valorVida/cont;
    }
}
