package com.spartaglobal.sort.controller;

import java.util.List;

public interface GenericSorter {

    <T extends Comparable> T[] sortArray(T[] array);
    <T extends Comparable> List<T> sortList(List<T> arrayList);

}
