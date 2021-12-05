package com.spartaglobal.sort.test;

import com.spartaglobal.sort.controller.GenericSorter;
import com.spartaglobal.sort.model.GenericQuickSort;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class GenericQuickSortTest {

    public static GenericSorter qs = new GenericQuickSort();
    @DisplayName("ArrayList Test")
    @Test
    public void arrayListTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(-5,8,-7,45,-8,-78,3,4,-6,71));
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        List<Integer> actualResult = qs.sortList(arrayList);
        Collections.sort(expectedResult);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @DisplayName("Empty ArrayList ")
    @Test
    public void emptyNullArrayList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> actualResult = qs.sortList(arrayList);
        assertNotNull(actualResult);
    }

    @DisplayName("Null ArrayList ")
    @Test
    @Disabled
    public void nullArrayList(){
        List<Integer> arrayList = null;
        List<Integer> actualResult = qs.sortList(arrayList);
        assertEquals(null, actualResult);
    }

    @DisplayName("Generic Test Random ")
    @Test
    public void randomNumberGeneratedList(){
        RandomArrayGenerator2 rd = new RandomArrayGenerator2(Integer.class);
        List<Integer> arrayList;
        arrayList = rd.randArrayList(1000);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        List<Integer> actualResult = qs.sortList(arrayList);
        Collections.sort(expectedResult);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }


    @DisplayName("One Element List")
    @Test
    public void oneElementList(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        List<Integer> actualResult = qs.sortList(arrayList);
        assertEquals(arrayList,actualResult);
    }


    @DisplayName("ArrayList Double")
    @Test
    public void arrayListWithDoubles(){
        List<Double> arrayList;
        RandomArrayGenerator2 rd = new RandomArrayGenerator2(Double.class);
        arrayList = rd.randArrayList(20);
        List<Double> expectedResult = new ArrayList<>();
        expectedResult.addAll(arrayList);
        Collections.sort(expectedResult);
        List<Double> actualResult = qs.sortList(arrayList);
        assertEquals(expectedResult, actualResult);
    }







    @DisplayName("Array Test")
    @Test
    public void arrayTest(){
        Integer[] array = {1,8,4,9,2,7,2,8,4,8,5,6,7,3,9,8,1,8,4,27,75};
        Integer[] expectedResult = Arrays.copyOf(array,array.length);
        Integer[] actualResult = qs.sortArray(array);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult, actualResult);
    }


    @DisplayName("Null Array")
    @Test
    public void nullArray(){
        Integer[] array = null;
        assertEquals(null, qs.sortArray(array));
    }

    @DisplayName("Empty Array")
    @Test
    public void emptyArray(){
        Integer[] array = {};
        assertEquals(null, qs.sortArray(array));
    }


    @DisplayName("Random Array with negative Numbers")
    @Test
    public void randomGeneratedArray(){
        RandomArrayGenerator2 rd = new RandomArrayGenerator2(Integer.class);
        Integer[] array = (Integer[]) rd.randArray(100);
        Integer[] expectedResult = Arrays.copyOf(array, array.length);
        Integer[] actualResult = qs.sortArray(array);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult,actualResult);
     }























}
