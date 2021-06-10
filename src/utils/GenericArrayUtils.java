package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericArrayUtils<T extends Comparable<T>> {

    /*public T[] sortArray(T[] array){
        List<T> list= Arrays.asList(array);
        list.sort(Comparable::compareTo); // Method reference instead of Lambda
        return (T[]) list.toArray();
    }*/

    public void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public T getElementByIndex(List<T> list, int index){
        return list.get(index);
    }
}



