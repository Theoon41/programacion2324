package Katas.kata3_kyu7;

public class Printer {
    public static void main(String[] args) {
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s));
    }

    public static String printerError(String s) {
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        int contaAciertos = 0;
        int i = 0;
        boolean is = false;
        // your code
        while (i < s.length()) {
            for (int j = 0; j < letters.length && !is; j++) {
                if (letters[j] == s.charAt(i)) {
                    contaAciertos++;
                    is = true;
                }
            }
            is = false;
            i++;
        }
        int errores = s.length()-contaAciertos;
        return (errores + "/" + s.length());
    }
}