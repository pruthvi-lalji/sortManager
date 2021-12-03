package com.spartaglobal.sort.controller;

import com.spartaglobal.sort.model.RandomArrayGenerator2;

import java.util.List;

public class GenerateSorter<T> extends SortController {
    private T[] array;
    private List<T> arrayList;

    public T[] arrayGen(Class c, int size){
        RandomArrayGenerator2 rand = new RandomArrayGenerator2(c);
        array = (T[]) rand.randArray(size);
        return array;
    }

    public List<T> arrayListGen(Class c, int size){
        RandomArrayGenerator2<T> rand = new RandomArrayGenerator2<T>(c);
        arrayList = rand.randArrayList(size);
        return arrayList;
    }

}
