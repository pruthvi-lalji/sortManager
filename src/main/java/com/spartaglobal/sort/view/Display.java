package com.spartaglobal.sort.view;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Display<T> {

    public void displayArrays(T[] unsorted, T[] sorted, List<Long> duration){
        System.out.println("Unsorted List: ");
        System.out.println(Arrays.toString(unsorted));
        System.out.println("Sorted List:");
        System.out.println(Arrays.toString(sorted));
        System.out.println(duration.get(0)*0.000001 + " ms");
    }

   public void displayArrayList(List<T> unsorted, List<T> sorted, List<Long> duration){
        System.out.println("Unsorted List: ");
        System.out.println(unsorted);
        System.out.println("Sorted List:");
        System.out.println(sorted);
       System.out.println(duration.get(0)*0.000001 + " ms");
    }

}
