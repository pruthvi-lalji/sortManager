package com.spartaglobal.sort.test;

import com.spartaglobal.sort.BubbleSort;
import com.spartaglobal.sort.controller.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {


    @DisplayName("Array with size of 9")
    @Test
    public void sortArrayList(){
        Sorter bs = new BubbleSort();
        int[] x = {2,4,6,7,9,8,1,3,5};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};
        int[] actualResult = bs.sort(x);
        assertArrayEquals(expectedResult,actualResult);
    }

    @DisplayName("Empty Array List")
    @Test
    public void emptyArrayList(){}{
        Sorter bs = new BubbleSort();
        int[] x = null;
        int[] expectedResult = null;
        int[] actualResult = bs.sort(x);
        assertArrayEquals(null,actualResult);
    }

    @DisplayName("Array of Size 1")
    @Test
    public void arrayWithOneLength(){
        Sorter bs = new BubbleSort();
        int[] x = {1};
        int[] expectedResult = {1};
        int[] actualResult = bs.sort(x);
        assertArrayEquals(expectedResult, actualResult);
    }

    @DisplayName("Array of Size 2")
    @Test
    public void arrayOfSizeTwo(){
        Sorter bs = new BubbleSort();
        int[] x = {9,4};
        int[] expectedResult = {4,9};
        int[] actualResult = bs.sort(x);
        assertArrayEquals(expectedResult,actualResult);
    }

}
