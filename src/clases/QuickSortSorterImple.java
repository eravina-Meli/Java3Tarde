package clases;

import Interfaces.Sorter;
import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] vector, Comparator<T> c) {
        T pivote = vector[0];
        int i = 0;
        int j = vector.length-1;
        T auxIntercambio;
        while (i < j) {
            while (c.compare(vector[i],pivote) <=0  && i < j) {
                i++;
            }
            while (c.compare(vector[j],pivote) > 0) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[0] = vector[j];
        vector[j] = pivote;
        if (0 < j - 1) {
            sort(vector, c);
        }
        if (j + 1 < 0) {
            sort(vector, c);
        }
    }
}
