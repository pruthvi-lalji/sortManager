package com.spartaglobal.sort;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.List;

public class GenericQuickSort implements GenericSorter {
    @Override
    public <T extends Comparable> T[] sortArray(T[] array) {
        quickSort(array, 0, array.length-1);
        return array;
    }


    private <T extends Comparable> T[] quickSort(T[] array, int lowIdx, int highIdx){
        if (lowIdx < highIdx){
            int p = partition(array, lowIdx, highIdx);
            quickSort(array, lowIdx, p-1);
            quickSort(array, p, highIdx);
        }
        return array;
    }

    private <T extends Comparable<T>> int partition(T[] array, int lowIdx, int highIdx){
        T pivot = array[lowIdx];

        while(highIdx >= lowIdx){
            while(array[lowIdx].compareTo(pivot) < 0){
                lowIdx++;
            }
            while (pivot.compareTo(array[highIdx])<0){
                highIdx--;
            }
            if (highIdx >= lowIdx){
                T temp = array[lowIdx];
                array[lowIdx] = array[highIdx];
                array[highIdx] = temp;
                ++lowIdx;
                --highIdx;
            }

        }
        return lowIdx;

    }





    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        quickSort(arrayList, 0, arrayList.size()-1);
        return arrayList;
    }


    private <T extends Comparable<? super T>> List<T> quickSort(List<T> arrayList, int lowIdx, int highIdx){
        if (lowIdx < highIdx){
            int p = partition(arrayList, lowIdx, highIdx);
            quickSort(arrayList, lowIdx, p-1);
            quickSort(arrayList, p+1, highIdx);
        }
        return arrayList;
    }


    private <T extends Comparable<? super T>> int partition(List<T> arrayList, int lowIdx, int highIdx){
        T pivot = arrayList.get(highIdx);
        int i = (lowIdx-1);
        for (int j = lowIdx; j <= arrayList.size()-1; j++){
            if (arrayList.get(j).compareTo(pivot) < 0){
                i++;
                //swap
                T temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, temp);
            }
        }
        T temp = arrayList.get(i+1);
        arrayList.set(i+1, arrayList.get(highIdx));
        arrayList.set(highIdx, temp);
        return i+1;
    }
}

