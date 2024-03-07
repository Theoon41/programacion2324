package Examen2223.interfaces;

import Examen2223.excepciones.JugueteException;
import Examen2223.modelo.Juguete;

public interface Apilable {
    public default void apilar(Juguete juguete) throws JugueteException {
        if (!(juguete instanceof Apilable)){
            throw new JugueteException("El juguete no es apilable");
        }
        if (juguete == this){
            throw new JugueteException("No te puedes apilar contigo mismo");
        }
        if (juguete.getClass() != this.getClass()){
            throw new JugueteException("No puedes apilar un juguete de tipo " + juguete.getClass().getSimpleName() + " con un juguete de tipo " + this.getClass().getSimpleName());
        }
    }
}
