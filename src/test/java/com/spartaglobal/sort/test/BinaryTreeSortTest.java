package com.spartaglobal.sort.test;

import com.spartaglobal.sort.model.BST;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeSortTest {

    BST bst = new BST();


    @DisplayName("Empty array")
    @Test
    public void emptyArrayTest(){
        Integer[] array = {};
        bst.run(array);
        assertEquals(null, bst.run(array));

    }

    @DisplayName("One element array")
    @Test
    public void oneElementArrayTest(){
        Integer[] array = {1};
        assertArrayEquals(array, bst.run(array));
    }

    @DisplayName("Array sorter")
    @Test
    public void arrayTest(){
        Integer[] array = {1,2,9,7,3,8,4,5,6,0,1};
        Integer[] sorted = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(sorted, bst.run(array));
    }



    @DisplayName("Empty ArrayList")
    @Test
    public void emptyArrayListTest(){
        List<Integer> arrayList= new ArrayList<>();
        assertEquals(null, bst.run(arrayList));
    }


    @DisplayName("Arraylist with one element")
    @Test
    public void oneElementListTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(5));
        assertEquals("[5]", bst.run(arrayList).toString());
    }


    @DisplayName("Arraylist Test")
    @Test
    public void ArrayListTest(){
        List<Integer> arrayList = new ArrayList<>(List.of(1,2,9,7,3,8,4,5,6,0,1));
        List<Integer> unsortedList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        assertEquals(unsortedList.toString(), bst.run(arrayList).toString());
    }

}
