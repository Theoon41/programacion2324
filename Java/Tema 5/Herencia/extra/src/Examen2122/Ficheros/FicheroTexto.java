package Examen2122.Ficheros;

import Examen2122.Ficheros.Fichero;
import Examen2122.Interfaces.Convertible;

public abstract class FicheroTexto extends Fichero implements Convertible {
    String[] parrafos;

    public FicheroTexto(String name, String[] parrafos) {
        super(name);
        setParrafos(parrafos);
    }

    public String[] getParrafos() {
        return parrafos;
    }

    public void setParrafos(String[] parrafos) {
        this.parrafos = parrafos;
    }

    @Override
    public long getSize() {
        long ac = 0;
        for (int i = 0; i < parrafos.length; i++){
            ac += parrafos[i] == null ? ac += 0 : parrafos[i].length();
        }
        return ac;
    }

    //He entendido por el enunciado que he de meter el array completo en un único String.
    @Override
    public String convertir() {
        StringBuilder conversion = new StringBuilder();
        for (int i = 0; i < parrafos.length; i++){
            if (parrafos[i] != null){
                conversion.append(parrafos[i]);
            }
        }
        return conversion.toString();
    }
}
