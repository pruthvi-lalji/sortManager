package com.spartaglobal.sort.controller;

import java.util.List;

public interface GenericSorter<T extends Comparable<? super T>>{
     T[] sortArray(T[] array);
     List<T> sort(List<T> arrayList);

     long sortTime();
}
