package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.List;

public class GenericBubbleSort implements GenericSorter {
    @Override
    public <T extends Comparable> T[] sortArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        boolean inOrder = false;
        while (!inOrder) {
            inOrder=true;
            for (int i =1; i < arrayList.size(); i++){
                if (arrayList.get(i-1).compareTo(arrayList.get(i)) > 0){
                    inOrder = false;
                    T temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i-1));
                    arrayList.set(i-1, temp);
                }
            }
        }
        return arrayList;
}
}
