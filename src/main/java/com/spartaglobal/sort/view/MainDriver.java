package com.spartaglobal.sort.view;

import com.spartaglobal.sort.model.BubbleSort;
import com.spartaglobal.sort.model.QuickSort;
import com.spartaglobal.sort.controller.Sorter;
import com.spartaglobal.sort.controller.UserController;
import com.spartaglobal.sort.model.RandomArrayGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDriver {
    public static long startTime;
    public static long endTime;
    private static String userInput;
    private static Scanner sc = new Scanner(System.in);
    private static int[] array;
    private static RandomArrayGenerator rd = new RandomArrayGenerator();
    private static List<Integer> arrayList;

    public static void main(String[] args) {

        UserController userControl = new UserController();
        userControl.userControl();



        //oldSort();

    }

    private static void oldSort() {
        boolean loop = true;
        while (loop) {
           try
           {
                System.out.println("Enter B for BubbleSort, Q for QuickSort, A for both,  and X to quit");
                userInput = sc.nextLine();
/*                   if (userInput == null || userInput.isEmpty()) {
                    System.out.println("Please enter a value");
                }*/
                array = rd.randArray(100);
                arrayList = rd.randArrayList(100);
                if (userInput.equals("B") || userInput.equals("b")) {
                    bubbleSort();
                }  if (userInput.equals("Q") || userInput.equals("q")) {
                    quickSort();
                }  if (userInput.equals("A") || userInput.equals("a")) {
                    bubbleSort();
                    quickSort();
                }  if (userInput.equals("X") || userInput.equals("x")){
                    loop = false;
                    System.out.println("System Exited");
                }
                break;
        } catch (NullPointerException e){
               System.out.println("Entered wrong input");
               continue;
           }
        }
    }


    private static void bubbleSort(){
        System.out.println("Bubble Sort: ");
        Sorter bs = new BubbleSort();
        System.out.println("Unsorted Array: ");
        displayArray(array);
        startTime = time();
        array = bs.sort(array);
        endTime = time();
        System.out.println("Sorted Array: ");
        displayArray(array);
        durationCalculation(endTime, startTime);
        startTime = time();
        arrayList = bs.sortList(arrayList);
        endTime = time();
        System.out.println("Sorted List Array:");
        displayArray(arrayList);
        durationCalculation(endTime, startTime);
        System.out.println();
    }

    private static void quickSort(){
        System.out.println("Quick Sort: ");
        Sorter qs = new QuickSort();
        System.out.println("Unsorted Array: ");
        displayArray(array);
        startTime = time();
        array = qs.sort(array);
        endTime = time();
        System.out.println("Sorted Array");
        displayArray(array);
        durationCalculation(endTime, startTime);
        startTime = time();
        arrayList = qs.sortList(arrayList);
        endTime = time();
        System.out.println("Sorted List Array");
        displayArray(arrayList);
        durationCalculation(endTime, startTime);
        System.out.println();
    }



    //display Arrays
    public static void displayArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void displayArray(List<Integer> array){
        System.out.println(array);
    }

    public static long time(){
        return System.nanoTime();
    }

    public static void durationCalculation(long endTime, long startTime){
        System.out.println("Time Taken: " + (endTime - startTime)*0.000001 + " ms");
    }



}
