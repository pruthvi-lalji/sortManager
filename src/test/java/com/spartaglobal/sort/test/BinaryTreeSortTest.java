package com.spartaglobal.sort.test;

import com.spartaglobal.sort.model.TreeSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeSortTest {
    TreeSort treeSort = new TreeSort();

    @DisplayName("Empty array")
    @Test
    public void emptyArrayTest(){
        Integer[] array = {};
        assertEquals(null, treeSort.sort(array));
    }
    @DisplayName("One element array")
    @Test
    public void oneElementArrayTest(){
        Integer[] array = {1};
        assertEquals(Arrays.asList(array), treeSort.sort(array));
    }

    @DisplayName("Array sorter")
    @Test
    public void arrayTest(){
        Integer[] array = {1,2,9,7,3,8,4,5,6,0,1};
        Integer[] sorted = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(Arrays.asList(sorted), treeSort.sort(array));
    }

    @DisplayName("Empty ArrayList")
    @Test
    public void emptyArrayListTest(){
        List<Integer> arrayList= new ArrayList<>();
        assertEquals(null, treeSort.sort(arrayList));
    }

    @DisplayName("Arraylist with one element")
    @Test
    public void oneElementListTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(5));
        assertEquals(5, treeSort.sort(arrayList).get(0));
    }
        @DisplayName("Arraylist Test")
    @Test
    public void ArrayListTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(1,2,9,7,3,8,4,5,6,0,1));
        List<Integer> unsortedList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        assertEquals(unsortedList, treeSort.sort(arrayList));
    }
}
