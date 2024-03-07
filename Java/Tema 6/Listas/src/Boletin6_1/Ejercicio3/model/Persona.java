package Boletin6_1.Ejercicio3.model;

import Boletin6_1.Ejercicio3.Excepciones.MensajeException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Persona  extends AlfabeticoComparator implements Cloneable{
    private String name;
    private List<Mensaje> bandejaEntrada;

    public Persona(String name) {
        this.name = name;
        bandejaEntrada = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Persona p, String message) throws MensajeException {
        p.bandejaEntrada.add(new Mensaje(this, message));
    }

    public String readMessage(){
        List<Mensaje>bandejaOrdenada = new ArrayList<>(bandejaEntrada);
        StringBuilder mensajes = new StringBuilder();
        for(int i = 0; i < bandejaOrdenada.size(); i++){
            mensajes.append("Mensaje ").append(i+1).append(": ").append(bandejaOrdenada.get(i)).append("\n");
        }
        return mensajes.toString();
    }

    public String readMessageOrdenado(){
        List<Mensaje>bandejaOrdenada = new ArrayList<>(bandejaEntrada);
        bandejaOrdenada.sort(null);
        StringBuilder mensajes = new StringBuilder();
        for(int i = 0; i < bandejaOrdenada.size(); i++){
            mensajes.append("Mensaje ").append(i+1).append(": ").append(bandejaOrdenada.get(i)).append("\n");
        }
        return mensajes.toString();
    }
    public String readMessageAlfabetic(){
        List<Mensaje>bandejaOrdenada = new ArrayList<>(bandejaEntrada);
        /*Comparator<Mensaje> alfaComparator = new Comparator<Mensaje>() {
            @Override
            public int compare(Mensaje o1, Mensaje o2) {
                return o1.getRemitente().getName().compareTo(b.getRemitente().getName());
            }
        };
        bandejaOrdenada.sort(alfaComparator);*/

        bandejaOrdenada.sort((a,b)-> a.getRemitente().getName().compareTo(b.getRemitente().getName()));

        StringBuilder mensajes = new StringBuilder();
        for(int i = 0; i < bandejaOrdenada.size(); i++){
            mensajes.append("Mensaje ").append(i+1).append(": ").append(bandejaOrdenada.get(i)).append("\n");
        }
        return mensajes.toString();
    }

    public void borrarMessage(int n) throws MensajeException{
        try{
            bandejaEntrada.remove(n-1);
        }catch (IndexOutOfBoundsException e){
            throw new MensajeException("No existe ese mensaje");
        }
    }

    public String messageFilter(String frase) throws MensajeException {
        StringBuilder mensaje = new StringBuilder();

        bandejaEntrada.stream().filter(m -> m.getText().contains(frase))
            .forEach(m -> mensaje.append("\n").append(m));

        if (mensaje.isEmpty()){
            throw new MensajeException("No existen mensajes con esta frase");
        }

        return mensaje.toString();
    }
}
