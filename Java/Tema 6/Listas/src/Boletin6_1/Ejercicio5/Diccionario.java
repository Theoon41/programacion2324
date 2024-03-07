package Boletin6_1.Ejercicio5;

import Boletin6_1.Ejercicio5.Exceptions.DiccionarioException;

import java.util.*;
import java.util.stream.Stream;

public class Diccionario {
    private Map<String, List<String>> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void añadirPalabra(String palabra, String definicion){
        if (!this.diccionario.containsKey(palabra)){
            List<String> definiciones = new ArrayList<>();
            this.diccionario.put(palabra, definiciones);
            definiciones.add(definicion);
        }else {
            this.diccionario.get(palabra).add(definicion);
        }
    }

    public List<String> buscarPalabra(String palabra) throws DiccionarioException {
        List<String> definiciones = this.diccionario.get(palabra);
        if (definiciones==null){
            throw new DiccionarioException("La palabra no ha sido encontrada.");
        }
        return definiciones;
    }

    public void borrarPalabra(String palabra) throws DiccionarioException {
        List<String> definiciones = this.diccionario.remove(palabra);
        if (definiciones==null){
            throw new DiccionarioException("La palabra no ha sido encontrada.");
        }
    }

    public List<String> listadoPalabras (String comienzoDePalabra){
        Set<String> claves = this.diccionario.keySet();
        List<String> palabrasEncontradas = new ArrayList<>();
        for (String palabra : claves){
            if (palabra.startsWith(comienzoDePalabra)){
                palabrasEncontradas.add(palabra);
            }
        }
        return palabrasEncontradas;
    }

    public List<String> listadoPalabrasFlujo (String comienzoDePalabra){
        return this.diccionario.keySet().stream().filter(palabra -> palabra.startsWith(comienzoDePalabra)).toList();
    }
}
