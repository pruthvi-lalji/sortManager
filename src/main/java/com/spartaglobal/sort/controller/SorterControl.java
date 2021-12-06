package com.spartaglobal.sort.controller;

import com.spartaglobal.sort.model.GenericBubbleSort;
import com.spartaglobal.sort.model.GenericQuickSort;
import com.spartaglobal.sort.model.RandomGenerator;
import com.spartaglobal.sort.model.TreeSort;
import com.spartaglobal.sort.model.ArrayPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SorterControl {
    RandomGenerator randomGenerator = new RandomGenerator();
    GenericSorter bubbleSort = new GenericBubbleSort();
    GenericSorter quickSort = new GenericQuickSort();
    TreeSort treeSort = new TreeSort();;
    ArrayPrinter arrayPrinter = new ArrayPrinter();
    private final LogGenerator logger = new LogGenerator(SorterControl.class);


    public void bubbleSort(int value, int arraySize) {
        System.out.println("Bubble Sort: ");
        logger.userLogger("Bubble Sort: ");
        if (value == 1){;
            logger.userLogger("Generating Array...");
            bubbleSort(randomGenerator.arrayGen(arraySize));
        }
        else if (value == 2){
            logger.userLogger("Generating List...");
            bubbleSort(randomGenerator.listGen(arraySize));
        }
        else{
            logger.userLogger("Generating Array...");
            bubbleSort(randomGenerator.arrayGen(arraySize));
            logger.userLogger("Generating List...");
            bubbleSort(randomGenerator.listGen(arraySize));
        }
        System.out.println();
    }


    private void bubbleSort(Integer[] unsortedArray){
        Integer[] sortedArray = Arrays.copyOf(unsortedArray,unsortedArray.length);
        bubbleSort.sortArray(sortedArray);
        arrayPrinter.displayArray(unsortedArray, sortedArray, bubbleSort.sortTime());
    }

    private void bubbleSort(List<Integer> unsortedList){
        List<Integer> sortedList = new ArrayList<>(unsortedList);
        bubbleSort.sort(sortedList);
        arrayPrinter.displayArrayList(unsortedList, sortedList, bubbleSort.sortTime());
    }


    public void quickSort(int value, int arraySize) {
        System.out.println("QuickSort: ");
        logger.userLogger("Quick Sort: ");
        if (value == 1){
            logger.userLogger("Generating Array...");
            quickSort(randomGenerator.arrayGen(arraySize));
        }
        else if (value == 2){
            logger.userLogger("Generating List...");
            quickSort(randomGenerator.listGen(arraySize));
        }
        else{
            //both
            logger.userLogger("Generating Array...");
            quickSort(randomGenerator.arrayGen(arraySize));
            logger.userLogger("Generating List...");
            quickSort(randomGenerator.listGen(arraySize));
        }
        System.out.println();
    }

    private void quickSort(Integer[] unsortedArray){
        Integer[] sortedArray = Arrays.copyOf(unsortedArray,unsortedArray.length);
        quickSort.sortArray(sortedArray);
        arrayPrinter.displayArray(unsortedArray,sortedArray, quickSort.sortTime());
    }

    private void quickSort(List<Integer> unsortedList){
        List<Integer> sortedList = new ArrayList<>(unsortedList);
        quickSort.sort(sortedList);
        arrayPrinter.displayArrayList(unsortedList,sortedList, quickSort.sortTime());
    }



    public void binarySort(int value, int arraySize) {
        System.out.println("Binary Tree Sort: ");
        logger.userLogger("Binary Tree Sort: ");
        logger.userLogger("Generating Array/List...");
        List<Integer> unsortedList = randomGenerator.listGen(arraySize);
        List<Integer> sortedList = new ArrayList<>(unsortedList);
        treeSort.sort(sortedList);
        arrayPrinter.displayArrayList(unsortedList, sortedList, treeSort.sortTime());
        System.out.println();
    }
}
