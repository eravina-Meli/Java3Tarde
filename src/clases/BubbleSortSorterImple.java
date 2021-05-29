package clases;

import Interfaces.Sorter;
import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] ArrayN, Comparator<T> c) {
        for (int i = 0; i < ArrayN.length - 1; i++) {// Bucle desde 0 hasta la longitud del array -1
            for (int j = 0; j < ArrayN.length - 1; j++) { //Bucle anidado desde 0 hasta la longitud del array -1
                if (c.compare(ArrayN[j],ArrayN[j + 1]) > 0 ) {//Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array)
                T temp = ArrayN[j + 1];// guardamos el número de la posicion j+1 en una variable (el menor)
                ArrayN[j + 1] = ArrayN[j]; //Lo intercambiamos de posición
                ArrayN[j] = temp; //y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado
                /* de esta forma vamos dejando los números mayores al final del array en orden*/
            }
            }
    }
}
}
