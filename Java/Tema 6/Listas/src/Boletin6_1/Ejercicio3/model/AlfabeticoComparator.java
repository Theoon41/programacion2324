package Boletin6_1.Ejercicio3.model;

import Boletin6_1.Ejercicio3.model.Mensaje;

import java.util.Comparator;

public class AlfabeticoComparator implements Comparator<Mensaje> {

    @Override
    public int compare(Mensaje o1, Mensaje o2) {
        return o1.getRemitente().getName().compareTo(o2.getRemitente().getName());
    }
}
