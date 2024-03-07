package Examen2122.Ficheros;

import Examen2122.Interfaces.Analizable;

public class FicheroEjecutable extends Fichero implements Analizable {
    private byte[] contenido;
    private int permisos;

    public FicheroEjecutable(String name, byte[] contenido, int permisos) {
        super(name);
        this.contenido = contenido;
        this.permisos = permisos;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public int getPermisos() {
        return permisos;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    @Override
    public String analizar() {
        return "Analizando" + getName();
    }
}
