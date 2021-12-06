package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.LogGenerator;
import com.spartaglobal.sort.controller.SorterControl;

import java.util.Arrays;
import java.util.List;

public class ArrayPrinter<T> {
    private final LogGenerator logger = new LogGenerator(SorterControl.class);
    public void displayArray(T[] unsorted, T[] sorted, long duration){
        System.out.println("Unsorted List: ");
        System.out.println(Arrays.toString(unsorted));
        System.out.println("Sorted List:");
        System.out.println(Arrays.toString(sorted));
        System.out.println("Time Taken: "+ duration*0.000001 + " ms");
        logger.userLogger("Array sorted: " + Arrays.toString(sorted) + " \nTime Taken: " + duration*0.000001 + " ms");

    }

    public void displayArrayList(List<T> unsorted, List<T> sorted, long duration){
        System.out.println("Unsorted List: ");
        System.out.println(unsorted);
        System.out.println("Sorted List:");
        System.out.println(sorted);
        System.out.println("Time Taken: "+ duration*0.000001 + " ms");
        logger.userLogger("List sorted: " + sorted + " \nTime Taken: " + duration*0.000001 + " ms");
    }


}
