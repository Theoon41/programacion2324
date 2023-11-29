//Vamos a hacer un juego en el que hay que levantar 2 "cartas" iguales por ronda.
//En caso de que sean iguales continuas si no son iguales pierdes un turno. Si te quedas sin turnos has perdido.
import java.util.Random;
import java.util.Scanner;

public class JuegoMatrices {
    //Creo un array en el que guardamos los valores de la A a la Z que van a ser las cartas.
    public static final char[] letras = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    //Creamos una entrada por teclado para que se nos indique el valor que va a tomar la matriz, ya que tiene que ser cuadrada y par.
    public static Scanner tc = new Scanner(System.in);
    //Creo una variable que guarda la salida del metodo numPar para el resto odel programa ir siempre usando ese valor y no tener que hacer multiples llamadas de este metodo.
    public static final int TAM_MATRIZ = numPar();
    public static final char OCULTO = '#';
    public static int vidas = 5;

    public static void main(String[] args) {
        //Genero mis variables y matrices.
        char[][] matriz = new char[TAM_MATRIZ][TAM_MATRIZ];
        boolean[][] matrizVisible = new boolean[TAM_MATRIZ][TAM_MATRIZ];
        char[][] matrizOculta = new char[TAM_MATRIZ][TAM_MATRIZ];
        int i, i2, j, j2;
        //Inicio generando mis arrays, tanto el array de OCULTOS como mi array desordenado.
        ocultarTodaLaMatriz(matrizVisible);
        generarMatriz(matriz);
        matrizDesordenada(matriz);
        imprimirMatriz(matriz);

        System.out.println("Bienvenido seas a mi jueguito.");
        System.out.println("Ten en cuenta que las posiciones van desde la 0 a la " + (TAM_MATRIZ - 1));
        //Un do while para que me ejecute el programa en función de las vidas que ,e quede. Cuando estas lleguen a 0 se acabó.
        do {
            imprimirMatrizVisible(matrizOculta, matrizVisible);
            System.out.println("Dime que posición deseas desvelar");
            i = MiEntradaSalida.leerEnteroEnRango(0, TAM_MATRIZ-1);
            j = MiEntradaSalida.leerEnteroEnRango(0, TAM_MATRIZ-1);

            if (!matrizVisible[i][j]) {
                matrizVisible[i][j] = true;
                matrizOculta[i][j] = matriz[i][j];
            }

            System.out.println("Dime la segunda posición a desvelar");
            i2 = MiEntradaSalida.leerEnteroEnRango(0, TAM_MATRIZ-1);
            j2 = MiEntradaSalida.leerEnteroEnRango(0, TAM_MATRIZ-1);

            if (!matrizVisible[i2][j2]) {
                matrizVisible[i2][j2] = true;
                matrizOculta[i2][j2] = matriz[i2][j2];
            }

            imprimirMatriz(matrizOculta);

            if (matriz[i][j] == matriz[i2][j2]) {
                System.out.println("Felicidades continuemos");
            } else {
                /*nivel dificultad del juego extremo. Cada vez que fallas se te oculta de nuevo toda la matriz.
                ocultarTodaLaMatriz(matrizVisible);*/
                //Nivel de dificultad easy solo se ocultan la ultima posición errónea
                matrizOculta[i][j] = OCULTO;
                matrizOculta[i2][j2] = OCULTO;
                vidas--;
                System.out.println("Te quedan " + vidas + " vidas");
            }
            System.out.println();

        } while (vidas != 0);


    }

    //Este metodo hace que solo se acepten valores positivos y pares de entrada para hacer la matriz.
    public static int numPar() {
        int a;
        do {
            System.out.println("Introduzca un valor par positivo porfavor.");
            a = tc.nextInt();
        } while ((a < 2) || (a % 2 != 0));
        return a;
    }

    //Este método imprime por pantalla la matriz.
    //Simplemente con un doble bucle for hacemos un recorrido de la matriz por filas y vamos sacando los valores por pantalla
    public static void imprimirMatriz(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //El metodo generarMatriz hace que se genere una matriz con el valor par que sacamos de numPar() en la cual metemos las letras de manera que haya siempre 2 letras de cada.
    //Para ello usamos una variable asistente que nos ayuda a reiniciar el ciclo de letras que introducimos una vez hayamos superado la mitad de posiciones de la matriz.
    //Para introducir los valores en la matriz lo hacemos con un doble bucle for y recorrido de la matriz por lineas.
    public static void generarMatriz(char[][] matriz) {
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (k > TAM_MATRIZ * TAM_MATRIZ / 2 - 1) {
                k = 0;
            }
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = letras[k++];
            }
        }
    }

    //Este método me va a desordenar la matriz. Cada posición se va a intercambiar por otra de manera aleatoria, usando una variable intermediaria para realizar los cambios.
    public static void matrizDesordenada(char[][] matriz) {
        Random rand = new Random();
        char temp;

        // Iterar sobre cada celda de la matriz e intercambiar posiciones con otras de manera aleatoria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Generar índices aleatorios dandoles como valor el tamaño de la matriz.
                int filaRandom = rand.nextInt(matriz.length);
                int columnaRandom = rand.nextInt(matriz.length);

                // Intercambiar elementos
                temp = matriz[i][j];
                matriz[i][j] = matriz[filaRandom][columnaRandom];
                matriz[filaRandom][columnaRandom] = temp;
            }
        }
    }

    //Este método pone a false toda una matriz booleana.
    private static void ocultarTodaLaMatriz(boolean[][] matrizVisible) {
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible.length; j++) {
                matrizVisible[i][j] = false;
            }
        }
    }

    //Este metodo me imprime # si el elemento de la matriz está oculto.
    private static void imprimirMatrizVisible(char[][] matrizOculta, boolean[][] matrizVisible) {
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible.length; j++) {
                if (!matrizVisible[i][j]) {
                    matrizOculta[i][j] = OCULTO;
                }
                System.out.print(matrizOculta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
