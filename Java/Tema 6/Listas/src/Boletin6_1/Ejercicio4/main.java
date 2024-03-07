package Boletin6_1.Ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        reverse2(arrayList).stream().forEach(System.out::println);
    }

    public static <T> ArrayList<T> reverse (ArrayList<T> arrayOriginal){
        ArrayList<T> arrayNuevo = new ArrayList<T>();
        //Para pivotar dentro del array
        int cont = 0;
        while (cont < arrayOriginal.size()){
            arrayNuevo.add(arrayOriginal.get(arrayOriginal.size()-1-cont++));
        }
        return arrayNuevo;
    }

    public static <T> ArrayList<T> reverse2 (ArrayList<T> arrayOriginal){
        ArrayList<T> arrayNuevo = new ArrayList<T>(arrayOriginal.size());
        Iterator<T> it = arrayOriginal.iterator();
        int cont = 0;
        while (it.hasNext()){
            arrayNuevo.set(arrayOriginal.size()-1-cont, it.next());
            cont++;
        }
        return arrayNuevo;
    }
}
