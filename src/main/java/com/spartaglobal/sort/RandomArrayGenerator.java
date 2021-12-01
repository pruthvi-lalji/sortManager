package com.spartaglobal.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayGenerator {

    Random rand;
    List<Integer> array;



    public int[] randArray(int arraySize){
        rand = new Random(50);
        int[] array  = new int[arraySize];
        for (int i =0; i < arraySize; i++){
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

     public List<Integer> randArrayList(int arraySize){
        rand = new Random(50);
        array = new ArrayList<>();
        for (int i=0; i < arraySize; i++){
            array.add(rand.nextInt(1000));
        }

        return array;
    }


}
