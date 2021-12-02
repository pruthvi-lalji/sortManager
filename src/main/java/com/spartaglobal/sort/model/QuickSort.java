package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.Sorter;

import java.util.List;

public class QuickSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        else if (array.length == 1){
            return array;
        }
         quickSort(array, 0, array.length-1);
         return array;
    }

    private int[] quickSort(int[] array, int low, int high){
        if (low < high){
            int p = partition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
        return array;
    }

    private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low-1);

        for (int j = low; j <=high-1;j++){
            if (array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }


    @Override
    public List<Integer> sortList(List<Integer> array) {
        if (array == null || array.isEmpty()){
            return null;
        }
        if (array.size() == 1){
            return array;
        }
        quickSortList(array, 0,array.size()-1);
        return array;
    }

    private List<Integer> quickSortList(List<Integer> array, int low, int high){
        if (low < high){
            int p = listPartition(array, low, high);
            quickSortList(array, low, p-1);
            quickSortList(array, p+1, high);
        }
        return array;

    }

    private int listPartition(List<Integer> array, int lowidx, int highidx){
        int pivot = array.get(highidx);
        int i = (lowidx-1);
        for (int j = lowidx; j <= highidx-1; j++){
            if (array.get(j) < pivot){
                //swap
                i++;
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }
        int temp = array.get(i+1);
        array.set(i+1,array.get(highidx));
        array.set(highidx, temp);
        return i+1;
    }






}
