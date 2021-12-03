package com.spartaglobal.sort.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserController2 {
    Scanner sc = new Scanner(System.in);
    String userInputed;
    int userInput;
    SortController sortControl = new SortController();
    String arrayType;



    private enum Options {ARRAY(1), ARRAYLIST(2), BOTH(3), MENU_MENU(4);
        private int value;
        Options(int value){this.value = value;}
    };


    public void userControl(){
        boolean iterOn = true;
        while(iterOn){
            System.out.println("---------------------- Sort Manager----------------------");
            System.out.println("1: Bubble Sort");
            System.out.println("2: Quick Sort");
            System.out.println("3: All Sorting Method");
            System.out.println("X: Exit");
            userInputed = sc.next();
            try{
                if (userInputed.equals("X") ||  userInputed.equals("x")){
                    iterOn = false;
                    System.out.println("Exited!");
                    ///LOGGER
                    break;
                }
                userInput = Integer.parseInt(userInputed);
            } catch (NumberFormatException e){
                System.out.println("Enter A Valid Input!");
                ///LOGGER
                continue;
            }

            switch (userInput){
                case 1:
                    //Type of array
                    int option = optionsSelection().value;
                    //Size of array
                    int size = arraySize();
                    sortControl.bubbleSort(option,"Integer",size);
                    break;
                case 2:
                    //quick sort
                     option = optionsSelection().value;
                     size = arraySize();
                     sortControl.quickSort(option, "Integer", size);
                    break;
                case 3:
                    option = optionsSelection().value;
                    size = arraySize();
                    sortControl.bubbleSort(option,"Integer", size);
                    sortControl.quickSort(option, "Integer",size);
                    break;
                default:
                    // Invalid option
                    System.out.println("Invaild");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //LOGGER
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }


    public Options optionsSelection(){
        System.out.println("Please select a option");
        System.out.println("1: Arrays");
        System.out.println("2: Array List");
        System.out.println("3: Both");
        System.out.println("M: Go Back To Main Menu");
        try{
            userInputed = sc.next();
            if (userInputed.equals("M") ||  userInputed.equals("m")){
                //LOGGER
                ///BACK TO MENU
                userControl();
            }
            userInput = Integer.parseInt(userInputed);
        } catch (NumberFormatException e){
            System.out.println("Enter A Valid Input!");
            ///LOGGER
        }
        switch (userInput){
            case 1:
                return Options.ARRAY;
            case 2:
                return Options.ARRAYLIST;
            case 3:
                return Options.BOTH;
            default:
                optionsSelection();
        }
    return Options.ARRAY;
    }

    public int arraySize(){
        System.out.println("What array size would you like? ");
        try{
            userInput = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Enter a valid value!");
            arraySize();
        }
        if(userInput < 1){
            System.out.println("Please enter positive value!");
            arraySize();
        }
        if (userInput > 10000000){
            System.out.println("Please enter value between 1 to 10000000");
            arraySize();
        }
      return userInput;
    }



}
