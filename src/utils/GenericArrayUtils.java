package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericArrayUtils{
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static <T> T getElementByIndex(List<T> list, int index){
        return list.get(index);
    }
}



