package Examen2223.main;

import Examen2223.utils.UserDataCollector;

public class Principal {

    public static final int MAX_JUGUETES = 10;
    public static Juguete[] juguetes = new Juguete[MAX_JUGUETES];
    public static int numJuguetes = 0;

    public static void main(String[] args) {
        boolean salir = false;


        FiguraMadera j1 = new FiguraMadera("Cubo", "Cubemax", "España", 2020, "Rojo", 6);
        FiguraMadera j2 = new FiguraMadera("Dodecaedro", "Cubemax", "Camerún", 2022, "Amarillo", 12);
        InstrumentoMusical j3 = new InstrumentoMusical("Xilófono", "Matel", "Brasil", 1999, 10);
        VehiculoPlastico j4 = new VehiculoPlastico("Ferrari F11", "Ferrari", 4);
        VehiculoPlastico j5 = new VehiculoPlastico("Camión Pegaso", "Juguematic", 8);
        PiezaLego j6 = new PiezaLego("Bloque de lego", "Lego", 4, "Azul");
        PiezaLego j7 = new PiezaLego("Bloque de lego", "Lego", 2, "Verde");
        addJuguete(j1);
        addJuguete(j2);
        addJuguete(j3);
        addJuguete(j4);
        addJuguete(j5);
        addJuguete(j6);
        addJuguete(j7);



        do {
            System.out.println(menu());
            int opcion = UserDataCollector.getEnteroMinMax("Selecciona una opción", 1, 7);

            switch (opcion) {
                case 1:
                    String nombre = UserDataCollector.getString("Introduce el nombre");
                    String marca = UserDataCollector.getString("Introduce la marca");
                    String origen = UserDataCollector.getString("Introduce el origen de la madera");
                    int anoTala = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    int numLados = UserDataCollector.getEntero("Introduce el número de lados de la figura");
                    String color = UserDataCollector.getString("Introduce el color de la figura");

                    //TODO: Completar

                    break;

                case 2:
                    String nombre_c2 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c2 = UserDataCollector.getString("Introduce la marca");
                    String origen_c2 = UserDataCollector.getString("Introduce el origen de la madera");
                    int anoTala_c2 = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    int edadMin_c2 = UserDataCollector.getEntero("Introduce la edad mínima");

                    //TODO: Completar

                    break;

                case 3:
                    String nombre_c3 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c3 = UserDataCollector.getString("Introduce la marca");
                    int numRuedas_c3 = UserDataCollector.getEntero("Introduce el número de ruedas");

                    //TODO: Completar

                    break;

                case 4:
                    String nombre_c4 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c4 = UserDataCollector.getString("Introduce la marca");
                    String color_c4 = UserDataCollector.getString("Introduce el color");
                    int unidades_c4 = UserDataCollector.getEntero("Introduce la medida, en unidades");

                    //TODO: Completar

                    break;

                case 5:
                    mostrarJuguetes();
                    int opcion1_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                    Juguete j1_c5 = juguetes[opcion1_c5 - 1];

                    //TODO: hacer comprobaciones y actuar según el enunciado

                    System.out.println("Selecciona ahora el juguete que quieres apilar");
                    mostrarJuguetes();
                    int opcion2_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                    Juguete j2_c5 = juguetes[opcion2_c5 - 1];

                    //TODO: hacer el resto

                    break;

                case 6:
                    // Mostrar todos los juguetes
                    break;

                case 7:
                    salir = true;
            }
        } while (!salir);

        System.out.println("Adiós");

    }

    private static String menu() {
        StringBuilder sb = new StringBuilder("Menú\n");
        sb.append("1. Crear una figura de madera\n");
        sb.append("2. Crear un instrumento musical\n");
        sb.append("3. Crear un vehículo de plástico\n");
        sb.append("4. Crear una pieza de lego\n");
        sb.append("5. Apilar un juguete\n");
        sb.append("6. Mostrar todos los juguetes\n");
        sb.append("7. Salir\n");

        return sb.toString();
    }


}