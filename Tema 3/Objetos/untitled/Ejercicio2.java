package untitled;


//Ocurrencias de un caracter.
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "babiloniaba";
        char c = 'b';
        int numChar = numCaracteres(cadena, c);
        System.out.println(numChar);
    }

    public static int numCaracteres(String cadena, char c) {
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c) {
                cont++;
            }
        }
        return cont;
    }

}
