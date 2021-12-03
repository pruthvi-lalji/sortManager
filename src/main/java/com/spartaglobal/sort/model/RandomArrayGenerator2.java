package com.spartaglobal.sort.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayGenerator2<T> {

    Random rand;;
    private final Class<T> type;
    private T[] array;
    private List<T> arrayList;

    public RandomArrayGenerator2(Class<T> type) {
        this.type = type;
    }


    public T[] randArray(int arraySize){
        array = (T[]) Array.newInstance(type,arraySize);
        rand = new Random(50);
        if (type == Integer.class){
            for (int i = 0; i < arraySize; i++){
                Integer j = rand.nextInt(1000);
                array[i] = (T) j;
            }
        }
        if (type == Double.class){
            for (int i =0; i < arraySize; i++){
                Double j = rand.nextDouble(1000);
                array[i] = (T) j;
            }
        }

       /* if (type == Long.class){

        }

        if (type == String.class){

        }*/
        return array;
    }


    public List<T> randArrayList(int arraySize){
        rand = new Random(50);
        arrayList  = new ArrayList<>();
        if (type == Integer.class){
        for (int i =0; i < arraySize; i++){
            Integer ig = rand.nextInt(1000+1000)-1000;
            arrayList.add((T) ig);
        }
        }
        if (type == Double.class){
            for (int i =0; i < arraySize; i++){
                Double j = rand.nextDouble(1000+1000) - 1000;
                arrayList.add((T) j);
            }
        }
        /* if (type == Long.class){

        }

        if (type == String.class){

        }*/
        return arrayList;
    }




}
