package com.spartaglobal.sort.test;

import com.spartaglobal.sort.BubbleSort;
import com.spartaglobal.sort.RandomArrayGenerator;
import com.spartaglobal.sort.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortArrayListTest {

    List<Integer> arrayList;
    RandomArrayGenerator rd = new RandomArrayGenerator();



    @DisplayName("ArrayList Test")
    @Test
    public void arrayListTest(){
        Sorter bs = new BubbleSort();
        arrayList = rd.randArrayList(100);
        List<Integer> acutalResult = bs.sortList(arrayList);
        Collections.sort(arrayList);
        assertEquals(Arrays.asList(arrayList), Arrays.asList(acutalResult));
    }

    @DisplayName("Empty ArrayList")
    @Test
    public void emptyArrayList(){
        Sorter bs = new BubbleSort();
        fail();

    }

}
