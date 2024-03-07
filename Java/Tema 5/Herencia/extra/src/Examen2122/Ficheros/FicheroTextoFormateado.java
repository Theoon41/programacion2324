package Examen2122.Ficheros;

import Examen2122.Ficheros.FicheroTexto;
import Examen2122.Interfaces.Analizable;

public class FicheroTextoFormateado extends FicheroTexto implements Analizable {
    private String typeFuente;
    private int sizeFuente;
    private String colorFuente;

    public FicheroTextoFormateado(String name, String[] parrafos, String typeFuente, int sizeFuente, String colorFuente) {
        super(name, parrafos);
        this.typeFuente = typeFuente;
        this.sizeFuente = sizeFuente;
        this.colorFuente = colorFuente;
    }
    @Override
    public String analizar() {
        return "Analizando" + getName();
    }
}
