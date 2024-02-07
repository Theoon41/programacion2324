package Boletin5_2.ejercicio2;

import javax.swing.*;
import java.util.Arrays;

public class Canvas {
    public static void main(String[] args) {
        try {
            Forma[] figuras = {new Rectángulo(12,7), new Circulo(3), new CirculoMovible(5)};
        } catch (RectanguloException | CirculoException e) {
            throw new RuntimeException(e);
        }

    }
    public static void dibujaYAnimaFormas(Forma[] formas){
        for(int i = 0; i < formas.length; i++){
            if(formas[i] instanceof Dibujable){
                ((Dibujable) formas[i]).dibujar();
            }
            if(formas[i] instanceof Animable){
                ((Animable) formas[i]).animar();
            }
            try {
                formas[i].calcularArea();
            } catch (LineaException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
