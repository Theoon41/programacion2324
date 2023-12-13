package Cartas;

public class Principal {
    public static final String[] palos = {"Picas", "Corazones", "Treboles", "Diamantes"};
    public static final int CARTAS_POR_PALO = 10;
    public static void main(String[] args) {
        Carta[] baraja = new Carta[palos.length * CARTAS_POR_PALO];

        for (int i = 0; i < palos.length; i++){
            for (int j = 0; j<CARTAS_POR_PALO; j++){
                baraja [i*CARTAS_POR_PALO+j] = new Carta(palos[i], String.valueOf(j+1));
            }
        }

        Juego j = new Juego(baraja);

        j.barajar();
        j.mostrarBaraja();
        System.out.println();

        try {
            j.repartir(2, 5);
        } catch (JuegoException e) {
            System.out.println(e.getMessage());
        }


    }
}
