
package com.spartaglobal.sort.test;

import com.spartaglobal.sort.controller.GenericSorter;
import com.spartaglobal.sort.model.GenericBubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortArrayListTest<T> {
    GenericSorter bubbleSort = new GenericBubbleSort();

    @DisplayName("Array Test")
    @Test
    public void arrayTest() {
        Integer[] array = {1, 8, 4, 9, 2, 7, 2, 8, 4, 8, 5, 6, 7, 3, 9, 8, 1, 8, 4, 27, 75};
        Integer[] expectedResult = Arrays.copyOf(array, array.length);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult, bubbleSort.sortArray(array));
    }

    @DisplayName("Null Array")
    @Test
    public void nullArray() {
        Integer[] array = null;
        assertEquals(null, bubbleSort.sortArray(array));
    }

    @DisplayName("Empty Array")
    @Test
    public void emptyArray() {
        Integer[] array = {};
        assertEquals(null, bubbleSort.sortArray(array));
    }

        @DisplayName("Empty/Null ArrayList ")
    @Test
    public void emptyNullArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList = null;
        List<Integer> actualResult = bubbleSort.sort(arrayList);
        assertEquals(null, actualResult);
    }



    @DisplayName("Generic Test")
    @Test
    public void genericTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(-5,8,-7,45,-8,-78,3,4,-6,71));
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        List<Integer> actualResult = bubbleSort.sort(arrayList);
        Collections.sort(expectedResult);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }


    @DisplayName("Negative Element List")
    @Test
    public void negativeElementList() {
        List<Integer> arrayList = new ArrayList<>(List.of(-5,8,-7,45,-8,-78,3,4,-6,71));
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        List<Integer> actualResult = bubbleSort.sort(arrayList);
        assertNotEquals(expectedResult.toString(), actualResult.toString());
    }




    @DisplayName("One Element List")
    @Test
    public void oneElementList(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        List<Integer> actualResult = bubbleSort.sort(arrayList);
        assertEquals(arrayList,actualResult);

    }


    @DisplayName("ArrayList Double")
    @Test
    public void arrayListWithDoubles(){
        List<Double> arrayList = new ArrayList(List.of(3.5,6.4,8.4,5.0,4.1,238.4,12.2,3.5,8.9,2.1));
        List<Double> expectedResult = new ArrayList<>(arrayList);
        Collections.sort(expectedResult);
        List<Double> actualResult = bubbleSort.sort(arrayList);
        assertEquals(expectedResult, actualResult);
    }

}


//
