package clases;

import Interfaces.Sorter;

import java.text.DateFormat;
import java.util.Comparator;
import java.util.Date;

public class mainClase3 {
    public static void main(String[] args) {
        /*Crear un array de 100 mil valores enteros, ordenado de mayor a menor con BubbleSort

        Integer[] enteros = new Integer[100000];
        for(int i =0; i< enteros.length; i++){
            enteros[i]=i;
        }
        Comparator<Integer> mayorAmenor = (a,b) -> b-a;
        Sorter sorter = (Sorter) miFactoryClass.getInstance("sorter");
        Timer timer = new Timer();
        timer.start();
        sorter.sort(enteros,mayorAmenor);
        timer.stop();
        long diferencia = timer.elapsedTime();
        System.out.println("Algoritmo BubbleSortSorterImple Demore: " + diferencia + " milisegundos");*/
        //Bubblesort demoro a - b =  7805 con 100.000 registros.
        //Bubblesort demoro b - a  = 38893 con 100.000 registros.


        /*Crear un array de 100 mil valores enteros, ordenado de mayor a menor con HeapSort*/
        Integer[] enteros = new Integer[100000];
        for(int i =0; i< enteros.length; i++){
            enteros[i]=i;
        }
        Comparator<Integer> mayorAmenor = (a,b) -> b-a;
        Sorter sorter = (Sorter) miFactoryClass.getInstance("sorter");
        Timer timer = new Timer();
        timer.start();
        sorter.sort(enteros,mayorAmenor);
        timer.stop();
        long diferencia = timer.elapsedTime();
        System.out.println("Algoritmo HeapSortSorterImple Demore: " + diferencia + " milisegundos");
        //HeapSort demoro a - b =  69 con 100.000 registros.
        //HeapSort demoro b - a  = 66 con 100.000 registros.


        /*Fecha Actual expresada en milisegundos
        long mili = System.currentTimeMillis();
        Date fecha = new Date(mili);
        System.out.println(fecha);*/

        /*Metodo Burbuja - Ordenamos Enteros y Strings
        Sorter c =  (Sorter) miFactoryClass.getInstance("sorter");
        //Integer arr[]={5,23,89,1,7,9};
        Comparator<Integer> enteros = (a,b) -> a-b;
        String arr[] ={"Hernan","Elton","Nicolas","Andres","Diego"};
        Comparator<String> strings = (a,b) -> b.compareTo(a);
        c.sort(arr,enteros);

        for (String x: arr){
            System.out.println(x);
        }*/

        /*Metodos HeapSort - Ordenamos Enteros y Strings
        Sorter c =  (Sorter) miFactoryClass.getInstance("sorter");
        //Integer arr[]={5,23,89,1,7,9};
        //Comparator<Integer> enteros = (a,b) -> a-b;
        String arr[] ={"Hernan","Elton","Nicolas","Andres","Diego"};
        Comparator<String> strings = (a,b) -> a.compareTo(b);
        c.sort(arr,strings);

        for (String x: arr){
            System.out.println(x);
        } */

        /*Metodos QuickSortSorterImple - Ordenamos Enteros y Strings
        Sorter c =  (Sorter) miFactoryClass.getInstance("sorter");
        Integer arr[]={5,23,89,1,7,9};
        Comparator<Integer> enteros = (a,b) -> a-b;
        //String arr[] ={"Hernan","Elton","Nicolas","Andres","Diego"};
        //Comparator<String> strings = (a,b) -> a.compareTo(b);
        c.sort(arr,enteros);

        for (int x: arr){
            System.out.println(x);
        }*/



    }
}
