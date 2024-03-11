package Boletin6_1.Ejercicio6.model;

import Boletin6_1.Ejercicio6.exceptions.CajaException;

import java.util.LinkedList;
import java.util.Queue;

public class Caja {
    private boolean abierta;
    private int numCaja;
    private Queue<Integer> cola;

    public Caja(int numCaja) {
        this.abierta = false;
        this.numCaja = numCaja;
        this.cola = new LinkedList<>();
    }

    public boolean isAbierta() {
        return abierta;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void abrirCaja() throws CajaException {
        if (abierta){
            throw new CajaException("La caja ya ha sido abierta.");
        }
        abierta = true;
    }

    public void cerrarCaja() throws CajaException {
        if (!abierta){
            throw new CajaException("La caja ya ha sido cerrada.");
        }
        if (!cola.isEmpty()){
            throw new CajaException("Aun hay clientes en la cola");
        }
        abierta = false;
    }

    public int getClientes(){
        return cola.size();
    }

    public void addCliente(Integer cliente) throws CajaException {
        if(!abierta){
            throw new CajaException("La caja no puede aceptar clientes porque esta cerrada");
        }
        cola.add(cliente);
    }
    public Integer antenderCliente() throws CajaException{
        if(!abierta){
            throw new CajaException("La caja no puede aceptar clientes porque esta cerrada");
        }
        Integer cliente = cola.poll();
        if (cliente == null){
            throw new CajaException("No hay clientes que atender");
        }
        return cliente;
    }
}
