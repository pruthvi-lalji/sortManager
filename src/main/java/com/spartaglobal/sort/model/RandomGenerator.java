package com.spartaglobal.sort.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    Random rand = new Random(100);

    public Integer[] arrayGen(int arraySize){
        Integer[] array = new Integer[arraySize];
        for (int i=0; i < arraySize; i++){
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    public List<Integer> listGen(int arraySize){
        List<Integer> list = new ArrayList<>();
        for (int i =0; i < arraySize; i++){
            list.add(rand.nextInt(1000));
        }
        return list;
    }











}
