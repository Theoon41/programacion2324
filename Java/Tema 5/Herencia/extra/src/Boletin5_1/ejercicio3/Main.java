package Boletin5_1.ejercicio3;

public class Main {
    public static void main(String[] args) {
        try {
            Mago magoA = new Mago("Manolo", Raza.ENANO, 15, 18, 21);
            Mago magoB = new Mago("Jaimito", Raza.ELFO, 12, 18, 19);
            Clerigo clerigoC = new Clerigo("Sebastian", Raza.HUMANO, 19, 14, 23, "Diso");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

            magoA.aprenderHechizo("Bola de fuego");
            magoA.aprenderHechizo("Mano de mago");
            magoB.aprenderHechizo("Lanza de rayo");
            magoB.aprenderHechizo("Mano de mago");
            magoB.aprenderHechizo("Lanza de hielo");

            System.out.println(magoA);
            System.out.println(magoB);

            magoA.lanzarHechizo("Mano de mago", magoB);
            magoB.lanzarHechizo("Lanza de rayo", magoA);
            magoB.lanzarHechizo("Lanza de hielo", magoA);
            magoB.lanzarHechizo("Mano de mago", magoA);
            clerigoC.curar(magoB);
            magoA.lanzarHechizo("Bola de fuego", clerigoC);
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

        } catch (PersonajeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
