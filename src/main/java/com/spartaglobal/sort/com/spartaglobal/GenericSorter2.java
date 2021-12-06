package com.spartaglobal.sort.com.spartaglobal;

import java.util.List;

public interface GenericSorter2<T extends Comparable<T>>{

     T[] sortArray(T[] array);
     List<T> sortList(List<T> arrayList);

}
