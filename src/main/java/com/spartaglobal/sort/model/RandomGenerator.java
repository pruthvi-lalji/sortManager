package com.spartaglobal.sort.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class RandomGenerator<T extends Comparable> {
    private T[] array;
    private List<T> list;
    private Random rand = new Random(100);
    private Object[] a;


    public List<T> getList(){
        return list;

    }
    public T[] getArray(){
        return array;
    }

    public void randomList(Function<Random, T> creator, int arraySize){
        list = new ArrayList<T>();
        for (int i =0; i < arraySize; i++){
            list.add(creator.apply(rand));
        }
    }

    public void randomArray(Function<Random, T> creator, int arraySize){
         array = (T[]) new Object[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = creator.apply(rand);
        }
    }
}
