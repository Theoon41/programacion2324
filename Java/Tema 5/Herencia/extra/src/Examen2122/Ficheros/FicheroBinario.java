package Examen2122.Ficheros;

import Examen2122.Ficheros.Fichero;

public class FicheroBinario extends Fichero {
    private byte[] contenido;
    public FicheroBinario(String name, byte[] contenido) {
        super(name);
        setContenido(contenido);
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }
}
