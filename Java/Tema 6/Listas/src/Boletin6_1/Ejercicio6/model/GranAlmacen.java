package Boletin6_1.Ejercicio6.model;

import Boletin6_1.Ejercicio6.exceptions.CajaException;
import Boletin6_1.Ejercicio6.exceptions.GranAlmacenException;

import java.util.stream.Stream;

public class GranAlmacen {
    public final int NUM_MAX_CAJAS = 20;
    private int numClientes;
    private Caja[] cajas;

    public GranAlmacen() {
        this.cajas = new Caja[NUM_MAX_CAJAS];
        for (int i = 0; i < NUM_MAX_CAJAS; i++){
            this.cajas[i] = new Caja(i+1);
        }
        this.numClientes = 0;
    }

    /**
     * @param numCaja
     * Me llega un número del 1 al NUM_MAX_CAJAS
     */
    public void abrirCaja(int numCaja) throws GranAlmacenException, CajaException {
        validarCaja(numCaja);
        cajas[numCaja-1].abrirCaja();
    }

    public void cerraCaja(int numCaja) throws GranAlmacenException, CajaException {
        validarCaja(numCaja);
        cajas[numCaja-1].cerrarCaja();
    }

    public String nuevoCliente() throws GranAlmacenException, CajaException {
        if(Stream.of(cajas).noneMatch(Caja::isAbierta)){
            throw new GranAlmacenException("No hay cajas abiertas. No podemos aceptar clientes.");
        }
        Caja c = Stream.of(cajas).filter(Caja::isAbierta).sorted((a,b)->a.getClientes()-b.getClientes()).toList().get(0);
        c.addCliente(++numClientes);
        return "Es usted el cliente número " + numClientes + " y debe ir a la caja número " + c.getNumCaja();
    }

    public Integer atenderCliente(int numCaja) throws GranAlmacenException, CajaException {
        validarCaja(numCaja);
        return cajas[numCaja-1].antenderCliente();
    }

    private void validarCaja(int numCaja) throws GranAlmacenException {
        if (numCaja < 1 || numCaja > NUM_MAX_CAJAS){
            throw new GranAlmacenException("La caja no existe");
        }
    }
}
