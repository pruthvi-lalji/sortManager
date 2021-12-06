package com.spartaglobal.sort.test;

import com.spartaglobal.sort.controller.GenericSorter;
import com.spartaglobal.sort.model.GenericQuickSort;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
public class GenericQuickSortTest {
    GenericSorter quickSort = new GenericQuickSort();

    @DisplayName("ArrayList Test")
    @Test
    public void arrayListTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-5, 8, -7, 45, -8, -78, 3, 4, -6, 71));
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        List<Integer> actualResult = quickSort.sort(arrayList);
        Collections.sort(expectedResult);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @DisplayName("Empty ArrayList ")
    @Test
    public void emptyNullArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        assertEquals(null, quickSort.sort(arrayList));
    }


    @DisplayName("Null ArrayList ")
    @Test
    @Disabled
    public void nullArrayList() {
        List<Integer> arrayList = null;
        List<Integer> actualResult = quickSort.sort(arrayList);
        assertEquals(null, actualResult);
    }


    @DisplayName("One Element List")
    @Test
    public void oneElementList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        List<Integer> actualResult = quickSort.sort(arrayList);
        assertEquals(arrayList, actualResult);
    }


    @DisplayName("ArrayList Double")
    @Test
    public void arrayListWithDoubles() {
        List<Double> arrayList = new ArrayList(List.of(3.5,6.4,8.4,5.0,4.1,238.4,12.2,3.5,8.9,2.1));
        List<Double> expectedResult = new ArrayList<>(arrayList);
        Collections.sort(expectedResult);
        assertEquals(expectedResult, quickSort.sort(arrayList));
    }


    @DisplayName("Array Test")
    @Test
    public void arrayTest() {
        Integer[] array = {1, 8, 4, 9, 2, 7, 2, 8, 4, 8, 5, 6, 7, 3, 9, 8, 1, 8, 4, 27, 75};
        Integer[] expectedResult = Arrays.copyOf(array, array.length);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult, quickSort.sortArray(array));
    }


    @DisplayName("Null Array")
    @Test
    public void nullArray() {
        Integer[] array = null;
        assertEquals(null, quickSort.sortArray(array));
    }

    @DisplayName("Empty Array")
    @Test
    public void emptyArray() {
        Integer[] array = {};
        assertEquals(null, quickSort.sortArray(array));
    }


}

