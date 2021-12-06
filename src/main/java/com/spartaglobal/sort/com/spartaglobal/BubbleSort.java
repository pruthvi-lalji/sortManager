package com.spartaglobal.sort.com.spartaglobal;

import java.util.List;

public class BubbleSort implements GenericSorter2 {


    @Override
    public Comparable[] sortArray(Comparable[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    Comparable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public List sortList(List arrayList) {

        return arrayList;
    }
}
