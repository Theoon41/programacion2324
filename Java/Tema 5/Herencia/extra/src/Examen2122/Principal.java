package Examen2122;

import Examen2122.Ficheros.*;
import Examen2122.Interfaces.Analizable;
import Examen2122.Interfaces.Convertible;
import Examen2122.Interfaces.Representable;
import Examen2122.Interfaces.Reproducible;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random r = new Random();

        Fichero fBinario = new FicheroBinario("Fichero Binario", generarArray(r.nextInt(1, 30)));
        Fichero fAudio = new FicheroAudio("Fichero Audio", generarArray(r.nextInt(1, 30)), r.nextInt(1, 30));
        Fichero fVideo = new FicheroVideo("Fichero Video", generarArray(r.nextInt(1, 30)), r.nextInt(1, 30));
        Fichero fImagen = new FicheroImagen("Fichero Imagen", generarArray(r.nextInt(1, 30)), TFormatoImagen.PPM);
        Fichero fEjecutable = new FicheroEjecutable("Fichero Ejecutable", generarArray(r.nextInt(1, 30)), r.nextInt(1, 30));
        Fichero fTextoFormateado = new FicheroTextoFormateado("Fichero de Texto Formateado", generateRandomStringArray(r.nextInt(1, 30)), "arial", r.nextInt(), "azul");
        Fichero fTextoPlano = new FicheroTextoPlano("Fichero de Texto Plano", generateRandomStringArray(r.nextInt(1, 30)));

        Fichero[] ficheros = {fBinario, fEjecutable, fAudio, fTextoPlano, fImagen, fVideo, fTextoFormateado};

        for(int i = 0; i < ficheros.length; i++){
            if (ficheros[i] instanceof Analizable){
                System.out.println(((Analizable) ficheros[i]).analizar());
            }
            if (ficheros[i] instanceof Convertible){
                System.out.println(((Convertible) ficheros[i]).convertir());
            }
            if (ficheros[i] instanceof Representable){
                ((Representable) ficheros[i]).representar();
            }
            if (ficheros[i] instanceof Reproducible){
                System.out.println(((Reproducible) ficheros[i]).reproducir());
            }
        }
    }

    public static String[] generateRandomStringArray(int size) {
        String[] randomStrings = new String[size];
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            int length = random.nextInt(10) + 1;
            for (int j = 0; j < length; j++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            randomStrings[i] = sb.toString();
        }
        return randomStrings;
    }

    public static byte[] generarArray(int size){
        Random r = new Random();
        byte[] arrayB = new byte[size];
        r.nextBytes(arrayB);

        return arrayB;
    }
}
