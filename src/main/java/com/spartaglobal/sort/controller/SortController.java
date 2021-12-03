package com.spartaglobal.sort.controller;

import com.spartaglobal.sort.model.GenericBubbleSort;
import com.spartaglobal.sort.model.GenericQuickSort;
import com.spartaglobal.sort.view.Display;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SortController<T extends Comparable> {
   private static GenericSorter bubbleSort = new GenericBubbleSort();
   private static GenericSorter quickSort = new GenericQuickSort();
   private static UserController userControl = new UserController();
   private static Display display = new Display();
   private static GenerateSorter gen = new GenerateSorter();
   public   T[] array;
   public   List<T> arrayList;
   private long startTime;
   private long endTime;
   private List<Long> duration = new ArrayList<>();

   public void bubbleSort(int selected, String arrayType,int arraySize /*, Class s*/){
      switch (selected){
         case 1:
            if (arrayType.equals("Integer")){
               array = (T[]) gen.arrayGen(Integer.class, arraySize);
               //Print Unsorted Array
               T[] unsortedArray = Arrays.copyOf(array,array.length);
               startTime = System.nanoTime();
               bubbleSort.sortArray(array);
               endTime = System.nanoTime();
               duration.add((endTime-startTime));
               display.displayArrays(unsortedArray,array,duration);
               duration.clear();
            }
            break;
         case 2:
            if (arrayType.equals("Integer")){

               arrayList = gen.arrayListGen(Integer.class, arraySize);
               List<T> unsortedList = new ArrayList<>(arrayList);
               startTime = System.nanoTime();
               bubbleSort.sortList(arrayList);
               endTime = System.nanoTime();
               duration.add(endTime-startTime);
               display.displayArrayList(unsortedList,arrayList, duration);
               duration.clear();
            }
            break;
         case 3:
            if (arrayType.equals("Integer")){
               T[] array = (T[]) gen.arrayGen(Integer.class, arraySize);
               List<T> arrayList = gen.arrayListGen(Integer.class,arraySize);
               List<T> unsortedList = new ArrayList<>(arrayList);
               T[] unsortedArray = Arrays.copyOf(array,array.length);
               startTime = System.nanoTime();
               bubbleSort.sortArray(array);
               endTime = System.nanoTime();
               duration.add(endTime-startTime);
               startTime = System.nanoTime();
               bubbleSort.sortList(arrayList);
               endTime = System.nanoTime();
               display.displayArrays(unsortedArray, array, duration);
               duration.clear();
               duration.add(endTime-startTime);
               display.displayArrayList(unsortedList, arrayList, duration);
               duration.clear();
            }
            break;
         default:
            //Log error and return to menu
            userControl.userControl();
            //Error
      }

   }

   public void quickSort(int selected, String arrayType,int arraySize){
      switch (selected){
         case 1:
            if (arrayType.equals("Integer")){
               T[] array = (T[]) gen.arrayGen(Integer.class, arraySize);
               T[] unsortedArray = Arrays.copyOf(array, arraySize);
               startTime = System.nanoTime();
               quickSort.sortArray(array);
               endTime = System.nanoTime();
               duration.add(endTime-startTime);
               display.displayArrays(unsortedArray, array, duration);
               duration.clear();
            }
            break;
         case 2:
            if (arrayType.equals("Integer")){
               arrayList = gen.arrayListGen(Integer.class, arraySize);
               List<T> unsortedList = new ArrayList<>(arrayList);
               startTime = System.nanoTime();
               quickSort.sortList(arrayList);
               endTime = System.nanoTime();
               duration.add(endTime-startTime);
               display.displayArrayList(unsortedList,arrayList,duration);
               duration.clear();
            }
            break;
         case 3:
            if (arrayType.equals("Integer")){
               array = (T[]) gen.arrayGen(Integer.class, arraySize);
               arrayList = gen.arrayListGen(Integer.class, arraySize);
               T[] unsortedArray = Arrays.copyOf(array, arraySize);
               List<T> unsortedList = new ArrayList<>(arrayList);
               startTime = System.nanoTime();
               quickSort.sortArray(array);
               endTime = System.nanoTime();
               duration.add(endTime-startTime);
               startTime = System.nanoTime();
               quickSort.sortList(arrayList);
               endTime = System.nanoTime();
               display.displayArrays(unsortedArray, array, duration);
               duration.clear();
               duration.add(endTime-startTime);
               display.displayArrayList(unsortedList,arrayList,duration);
            }
            break;
         default:
            //Log error and return to menu
            userControl.userControl();
            //Error
      }
   }

}
