package Cartas;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Juego {
    private Carta[] baraja;
    private int contador;

    public Juego(Carta[] baraja) {
        this.baraja = baraja;
        contador = 0;
    }


    public void mostrarBaraja() {
        for (int i = contador; i < baraja.length; i++) {
            System.out.println(baraja[i].toString());
        }
    }

    public void barajar() {
        Random rand = new Random();
        Carta temp;

        for (int i = contador; i < baraja.length; i++) {
            int barajaRandom = rand.nextInt(contador, baraja.length);

            temp = baraja[i];
            baraja[i] = baraja[barajaRandom];
            baraja[barajaRandom] = temp;

        }
    }

    public void repartir(int numJugadores, int numCartas) throws JuegoException {
        if (cartasRestantes() >= (numJugadores * numCartas)) {
            for (int i = 0; i < numJugadores; i++) {
                System.out.println("Repartiendo cartas al jugador " + (i + 1));
                for (int j = 0; j < numCartas; j++) {
                    System.out.println("\t" + baraja[contador++]);
                }
            }
        } else {
            throw new JuegoException("No hay cartas suficientes para repartir");
        }
    }

    public int cartasRestantes() {
        return baraja.length - contador;
    }

}
