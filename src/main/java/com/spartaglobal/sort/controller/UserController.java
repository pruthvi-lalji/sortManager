package com.spartaglobal.sort.controller;
import com.spartaglobal.sort.model.GenericBubbleSort;
import com.spartaglobal.sort.model.GenericQuickSort;
import com.spartaglobal.sort.model.RandomArrayGenerator2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserController<T> {
    private static Scanner sc = new Scanner(System.in);
    private  int userInput;
    private String userInputed;



    private enum Options {ARRAY(1), ARRAYLIST(2), BOTH(3);
        private int value;
        private Options(int value){this.value = value;}
    };

    public<T extends Comparable> void userControl(){
        boolean runSystem = true;
        while(runSystem){
            System.out.println("Enter 1 for BubbleSort, 2 for QuickSort, 3 for both, or X to quit");
            //takes in the user input as a string
            userInputed = sc.next();
            try {
                //check if user had enter x for quiting the system
                if (userInputed.equals("X") || userInputed.equals("x")){
                    runSystem = false;
                    System.out.println("Exited!");
                    break;
                }
                //Parse the input into the Integers
                userInput = Integer.parseInt(userInputed);
            } catch (NumberFormatException e){
                //Input logger here
                System.out.println("Input a valid option!");
                continue;
            }
            Options sortType;
            switch (userInput) {
                case 1 -> {
                    GenericSorter bubbleSort = new GenericBubbleSort();
                    System.out.println("------------------------------------Bubble Sort------------------------------------");
                    sortType = listSelection();
                    if (sortType.equals(Options.ARRAY)) {
                        System.out.println("Array Selected!");
                        bubbleSortArray(bubbleSort);
                    }
                    else if (sortType.equals(Options.ARRAYLIST)) {
                        System.out.println("Arraylist Selected!");
                        bubbleSortArrayList(bubbleSort);
                    }
                    else {
                        System.out.println("Both Selected!");
                        bubbleSortArray(bubbleSort);
                        bubbleSortArrayList(bubbleSort);

                    }
                }
                case 2 -> {
                    GenericSorter quickSort = new GenericQuickSort();
                    List<Integer> randArrayList;
                    System.out.println("------------------------------------Quick Sort------------------------------------");
                    sortType = listSelection();
                    if (sortType.equals(Options.ARRAY)) {
                        quickSortArray(quickSort);
                        break;
                    }
                    if (sortType.equals(Options.ARRAYLIST)) {
                        System.out.println("Arraylist Selected!");
                        quickSortArrayList(quickSort);

                    } else {
                        System.out.println("Array / ArrayList");
                        System.out.println("Array: ");
                        quickSortArray(quickSort);
                        quickSortArrayList(quickSort);
                    }
                }
                case 3 -> System.out.println("Both");
                default -> System.out.println("Input a valid option!");
            }

        }
    }

    private void bubbleSortArrayList(GenericSorter bubbleSort) {
        List<Integer> randArrayList = arrayListGenerator();
        System.out.println("Unsorted Array: ");
        System.out.println(randArrayList);
        System.out.println("Sorted Array: ");
        System.out.println(bubbleSort.sortList(randArrayList));
    }

    private <T extends Comparable> void bubbleSortArray(GenericSorter bubbleSort) {
        T[] randArray = arrayGenerator();
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(randArray));
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(bubbleSort.sortArray(randArray)));
    }

    private <T extends Comparable> void quickSortArray(GenericSorter quickSort) {
        T[] randArray = arrayGenerator();
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(randArray));
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(quickSort.sortArray(randArray)));
    }

    private void quickSortArrayList(GenericSorter qs) {
        List<Integer> randArrayList;
        randArrayList = arrayListGenerator();
        System.out.println("Unsorted Array: ");
        System.out.println(randArrayList);
        System.out.println("Sorted Array: ");
        System.out.println(qs.sortList(randArrayList));
    }


    //List selection
    private Options listSelection(){
        System.out.println("1 for Arrays, 2 for ArrayList or B for Both");
        userInputed = sc.next();
        try {
            if (userInputed.equals("b") || userInputed.equals("B")) {
                //testDriver(value,Options.BOTH);
                return Options.BOTH;
            }
            userInput = Integer.parseInt(userInputed);
        }catch (NumberFormatException e){
            System.out.println("Please select one option!");
            listSelection();
        }
        if (userInput < 3){
            if (userInput == 2){ return Options.ARRAYLIST; }
        }
        else listSelection();

        return Options.ARRAY;
    }


    private <T> T[]  arrayGenerator(){
        System.out.println("Would you like to generate random array?  Y for yes or N for N0");
        userInputed = sc.next();
        T array[] = null;
        if (userInputed.equals("Y") || userInputed.equals("y")){
            boolean validInput = false;
            do {
            System.out.println("Enter the size of array");
            try {
                if (sc.hasNext()) {
                    userInput = sc.nextInt();
                    RandomArrayGenerator2 rd = new RandomArrayGenerator2(Integer.class);
                    array = (T[]) rd.randArray(userInput);
                    validInput = true;
                }
            } catch (InputMismatchException e){
                System.out.println("Enter Valid Input!");
                sc.next();
            }
          } while(!validInput);

        } else arrayGenerator();

        return array;
    }



    private <T> List<T>  arrayListGenerator(){
        System.out.println("Would you like to generate random array list?  Y for Yes or N for No");
        userInputed = sc.next();
        List<T> arrayList = null;
        if (userInputed.equals("Y") || userInputed.equals("y")){
            System.out.println("Enter the size of array");
            try {
                if (sc.hasNext()) {
                    userInput = sc.nextInt();
                    RandomArrayGenerator2 rd = new RandomArrayGenerator2(Integer.class);
                    arrayList =  rd.randArrayList(userInput);
                }
            } catch (InputMismatchException e){
                System.out.println("Enter Valid Input!");
            }
        }else arrayListGenerator();
        return arrayList;
    }




}
