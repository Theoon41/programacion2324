package untitled;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena1 = "bb";
        int cont = 0;
        int pos;
        for (int i= 0; i < cadena1.length(); i++){
            pos = cadena1.indexOf("a",i);
            if (pos==0) {
                cont++;
            }else{
                if (!(cadena1.charAt(pos) == -1) && (cadena1.charAt(pos - 1) == ' ' )){
                    cont++;
                    i=pos;
                }
            }
        }
        System.out.println(cont);
    }
}
