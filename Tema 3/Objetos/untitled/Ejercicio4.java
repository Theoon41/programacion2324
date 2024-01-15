package untitled;

public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = "wliguhoiahgl";
        String palabraEscondida = "igual";
        if (encontrada(frase, palabraEscondida)){
            System.out.println("La palabra ha sido encontrada");
        }else {
            System.out.println("No ha sido encontrada la palabra");
        }

    }
    public static boolean encontrada(String frase, String palabra){
        int cont = 0;
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        for (int i = 0; i < frase.length() && cont < palabra.length(); i++){
            if (palabra.charAt(cont) == frase.charAt(i)){
                cont++;
            }
        }
        return (cont==palabra.length());
    }
}
