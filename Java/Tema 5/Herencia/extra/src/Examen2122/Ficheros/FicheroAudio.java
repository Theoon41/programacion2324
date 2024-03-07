package Examen2122.Ficheros;

import Examen2122.Interfaces.Reproducible;

public class FicheroAudio extends Fichero implements Reproducible{
    private byte[] contenido;
    private int duracion;

    public FicheroAudio(String name, byte[] contenido, int duracion) {
        super(name);
        this.contenido = contenido;
        this.duracion = duracion;
    }
    public byte[] getContenido() {
        return contenido;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    @Override
    public String reproducir() {
        return "reproducir" + getName();
    }
}
