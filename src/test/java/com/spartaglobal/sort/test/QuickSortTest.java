package com.spartaglobal.sort.test;

import com.spartaglobal.sort.model.QuickSort;
import com.spartaglobal.sort.model.RandomArrayGenerator;
import com.spartaglobal.sort.controller.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
    private static RandomArrayGenerator rd = new RandomArrayGenerator();
    int[] array;

    @DisplayName("Quick Sort Array")
    @Test
    public void sortArrayList() {
        Sorter qs = new QuickSort();
        array = rd.randArray(100);
        int[] actualResult = qs.sort(array);
        Arrays.sort(array);
        assertArrayEquals(array, actualResult);
    }


    @DisplayName("Empty Array")
    @Test
    public void emptyArrayList(){
        Sorter qs = new QuickSort();
        int[] array = {};

        assertEquals(null, qs.sort(array));
    }

    @DisplayName("Array with 1 Element")
    @Test
    public void arrayWithOne(){
        Sorter qs = new QuickSort();
        int[] array = {4};
        int[] actualResult = qs.sort(array);
        assertArrayEquals(array, actualResult);
    }

    @DisplayName("Array with Negative Number")
    @Test
    public void negativeNumbersArray(){
        Sorter qs = new QuickSort();
        int[] array = {-9,5,-7,-20,4,-7,-2,7,48,-24,1};
        int[] actualResult = qs.sort(array);
        Arrays.sort(array);
        assertArrayEquals(array,actualResult);
    }


}