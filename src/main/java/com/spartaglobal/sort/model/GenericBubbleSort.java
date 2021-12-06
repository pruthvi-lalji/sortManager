package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.List;

public class GenericBubbleSort<T extends Comparable<? super T>> implements GenericSorter<T> {
    private long sortTime;
    @Override
    public T[] sortArray(T[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        sortTime = endTime-startTime;
        return array;
    }

    @Override
    public List<T> sort(List<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()){
            return null;
        }
        long startTime = System.nanoTime();
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
        long endTime = System.nanoTime();
        sortTime = endTime-startTime;
        return arrayList;
    }

    public long sortTime(){
        return sortTime;
    }




}
