package Examen2122.Ficheros;

import Examen2122.Ficheros.FicheroTexto;
import Examen2122.Interfaces.Representable;

public class FicheroTextoPlano extends FicheroTexto implements Representable {
    public FicheroTextoPlano(String name, String[] parrafos) {
        super(name, parrafos);
    }

    @Override
    public void representar() {
        for (int i = 0; i < getParrafos().length; i++){
            if (getParrafos()[i] != null){
                System.out.println(getParrafos()[i]);
            }
        }
    }
}
