package com.spartaglobal.sort.controller;

import com.spartaglobal.sort.model.GenericBubbleSort;
import com.spartaglobal.sort.model.GenericQuickSort;
import com.spartaglobal.sort.model.RandomArrayGenerator2;

import java.util.Arrays;
import java.util.List;


public class SortController<T extends Comparable> {
   private static GenericSorter bubbleSort = new GenericBubbleSort();
   private static GenericSorter quickSort = new GenericQuickSort();
   private static UserController2 userControl = new UserController2();
   private  T[] array;
   private  List<T> arrayList;

   public void bubbleSort(int selected, String arrayType,int arraySize){
      switch (selected){
         case 1:
            if (arrayType.equals("Integer")){
               array = arrayGen(Integer.class, arraySize);
               //Print Unsorted Array
               bubbleSort.sortArray(array);
               //Print Sorted Array
            }
            break;
         case 2:
            if (arrayType.equals("Integer")){
               arrayList = arrayListGen(Integer.class, arraySize);
               bubbleSort.sortList(arrayList);
               System.out.println(arrayList);
            }
            break;
         case 3:
            if (arrayType.equals("Integer")){
               T[] array = arrayGen(Integer.class, arraySize);
               List<T> arrayList = arrayListGen(Integer.class,arraySize);
               bubbleSort.sortArray(array);
               bubbleSort.sortList(arrayList);
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
               T[] array =  arrayGen(Integer.class, arraySize);
               quickSort.sortArray(array);
            }
            break;
         case 2:
            if (arrayType.equals("Integer")){
               //print array
               quickSort.sortList(arrayList);
               System.out.println(arrayList);
            }
            break;
         case 3:
            if (arrayType.equals("Integer")){
               arrayGen(Integer.class, arraySize);
               quickSort.sortArray(array);
               quickSort.sortList(arrayList);
            }
            break;
         default:
            //Log error and return to menu
            userControl.userControl();
            //Error
      }

   }




   private T[] arrayGen(Class c, int size){
      RandomArrayGenerator2 rand = new RandomArrayGenerator2(c);
      array = (T[]) rand.randArray(size);
      return array;
   }

   private List<T> arrayListGen(Class c, int size){
      RandomArrayGenerator2<T> rand = new RandomArrayGenerator2<T>(c);
      arrayList = rand.randArrayList(size);
      return arrayList;
   }





}
