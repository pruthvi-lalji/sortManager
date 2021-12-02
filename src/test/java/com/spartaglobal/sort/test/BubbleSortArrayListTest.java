package com.spartaglobal.sort.test;

import com.spartaglobal.sort.model.BubbleSort;
import com.spartaglobal.sort.model.RandomArrayGenerator;
import com.spartaglobal.sort.controller.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<Integer> expectedResult = rd.randArrayList(100);
        Collections.sort(expectedResult);
        assertEquals(Arrays.asList(expectedResult), Arrays.asList(acutalResult));
    }

    @DisplayName("Empty ArrayList")
    @Test
    public void emptyArrayList(){
        Sorter bs = new BubbleSort();
        arrayList = new ArrayList<>();
        List<Integer> actualResults = bs.sortList(arrayList);
        assertEquals(null, actualResults);
    }


    @DisplayName("One Element List")
    @Test
    public void oneElementList(){
        Sorter bs = new BubbleSort();
        arrayList = new ArrayList<>();
        arrayList.add(6);
        List<Integer> actualResult = bs.sortList(arrayList);
        assertEquals(arrayList,actualResult);

    }


    @DisplayName("Negative Element List")
    @Test
    public void negativeElement() {
        Sorter bs = new BubbleSort();
        List<Integer> arrayList = new ArrayList<>(List.of(-5,8,-7,45,-8,-78,3,4,-6,71));
        List<Integer> expectedResult = new ArrayList<>();
         for (Integer elm:arrayList){
             expectedResult.add(elm);
         }
       List<Integer> actualResult = bs.sortList(arrayList);
       // System.out.println(arrayList);
      //  System.out.println(expectedResult);
        assertNotEquals(expectedResult.toString(), actualResult.toString());
    }
}
