package Katas.kata1_kyu7;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listaFiltrada = new ArrayList<>();
        // Return the List with the Strings filtered out
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) instanceof Integer){
                listaFiltrada.add(list.get(i));
            }
        }
        return listaFiltrada;
    }
}
