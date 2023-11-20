
public class RecorrerArray {
    public static void main(String[] args) {
        int[] miArray = new int [5];
        int[] miArray2 = {1,2,3,4,5};


        for (int i = miArray2.length - 1; i>=0; i--){
            miArray[miArray.length-1-i] = miArray2[i];
        }
        for (int elem: miArray){
            System.out.println(elem);
        }

    }
    //Busqueda de elementos en un array.
    public static int buscarElementoEnVector(double [] vector, double elementoBuscado){
        int posicion =-1;
        int i=0;
        while (i<vector.length&&posicion==-1){
            if (vector[i]==elementoBuscado)
                posicion = i;
            else
                i++;
        }
        return posicion;
    }
}
