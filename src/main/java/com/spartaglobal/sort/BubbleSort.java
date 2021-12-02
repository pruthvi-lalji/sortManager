package com.spartaglobal.sort;

import com.spartaglobal.sort.controller.GenericSorter;
import com.spartaglobal.sort.controller.Sorter;

import java.util.List;

public class BubbleSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array == null || array.length ==0){
            return null;
        }
        if(array.length == 1){
            return array;
        }
        for (int i =0; i < array.length; i++){
            for (int j=0;j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    @Override
    public List<Integer> sortList(List<Integer> array){
        if (array == null || array.isEmpty()){
            return null;
        }
        else if (array.size() == 1){
            return array;
        }
        for (int i=0; i < array.size(); i++){
            for (int j =0; j <array.size()-i-1;j++){
                if (array.get(j) > array.get(j+1)){
                    int temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);
                }
            }
        }
        return array;
    }


  }
