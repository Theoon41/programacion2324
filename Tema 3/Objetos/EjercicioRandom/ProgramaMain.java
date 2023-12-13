package EjercicioRandom;

import java.time.LocalDateTime;

public class ProgramaMain {
    public static void main(String[] args) {
        Deposito d = new Deposito(200000, 125000);
        Avion avion = new Avion("airbus", "a330", 13, d);

        avion.addRevision(new Revision(LocalDateTime.of(2023,10, 12, 22,37), true, 6));

        System.out.println(avion.puedeVolar(15000)? "Puede recorrer esa distancia" : "No puede volar");
    }
}
