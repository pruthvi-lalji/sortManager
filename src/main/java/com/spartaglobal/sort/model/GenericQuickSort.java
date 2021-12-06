package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericQuickSort<T extends Comparable<? super T>> implements GenericSorter<T> {
    private long sortTime;
    @Override
    public T[] sortArray(T[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        long startTime = System.nanoTime();
        T[] arrayToSort = Arrays.copyOf(array,array.length);
        quickSort(arrayToSort, 0, arrayToSort.length-1);
        long endTime = System.nanoTime();
        sortTime = endTime-startTime;
        return arrayToSort;
    }

    private void quickSort(T[] arr, int lowIdx, int highIdx){
        if (lowIdx < highIdx){
            int p = partition(arr, lowIdx, highIdx);
            quickSort(arr, lowIdx, p-1);
            quickSort(arr, p, highIdx);
        }
    }

    private int partition(T[] arr, int lowIdx, int highIdx){
        T pivot = arr[lowIdx];
        while(highIdx >= lowIdx){
            while(arr[lowIdx].compareTo(pivot) < 0){
                lowIdx++;
            }
            while (pivot.compareTo(arr[highIdx])<0){
                highIdx--;
            }
            if (highIdx >= lowIdx){
                T temp = arr[lowIdx];
                arr[lowIdx] = arr[highIdx];
                arr[highIdx] = temp;
                ++lowIdx;
                --highIdx;
            }
        }
        return lowIdx;

    }

    @Override
    public List<T> sort(List<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()){
            return null;
        }
        long startTime = System.nanoTime();
        List<T> listToSort = new ArrayList<>(arrayList);
        quickSort(listToSort, 0, arrayList.size()-1);
        long endTime = System.nanoTime();
        sortTime = endTime-startTime;
        return listToSort;
    }

    private void quickSort(List<T> arr, int lowIdx, int highIdx){
        if (lowIdx < highIdx){
            int p = partition(arr, lowIdx, highIdx);
            quickSort(arr, lowIdx, p-1);
            quickSort(arr, p+1, highIdx);
        }
    }


    private int partition(List<T> arr, int lowIdx, int highIdx){
        T pivot = arr.get(highIdx);
        int i = (lowIdx-1);
        for (int j = lowIdx; j <= arr.size()-1; j++){
            if (arr.get(j).compareTo(pivot) < 0){
                i++;
                //swap
                T temp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, temp);
            }
        }
        T temp = arr.get(i+1);
        arr.set(i+1, arr.get(highIdx));
        arr.set(highIdx, temp);
        return i+1;
    }


    @Override
    public long sortTime() {
        return sortTime;
    }



}
