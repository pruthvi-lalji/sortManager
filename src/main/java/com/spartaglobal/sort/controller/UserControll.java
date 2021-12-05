package com.spartaglobal.sort.controller;

import java.util.Scanner;

public class UserControll<T> {

    private Scanner sc = new Scanner(System.in);

    private final LogGenerator logger = new LogGenerator(UserControll.class);

    SorterControl sorterControl = new SorterControl();

    private enum Options {ARRAY(1), ARRAYLIST(2), BOTH(3);
        private int value;
        Options(int value){this.value = value;}
    };

    private String userInputted;
    private int userInput;

    public void start(){
        System.out.println("---------------------- Sort Manager----------------------\n1: Bubble Sort \n2: Quick Sort \n3: Binary Tree \n4: All Sorting Method \nX: Exit");
        userInputted = sc.next();
        if (userInputted == null || userInputted.isEmpty()){
            System.out.println("Enter a valid response!");
            logger.userLogger("Null/Empty response!");
            start();
        }
        if (userInputted.equals("X") || userInputted.equals("x")){
            System.out.println("Exited!");
            logger.userLogger("User Exited System");
        }
        try {
            userInput = Integer.parseInt(userInputted);
            if (userInput > 4){
                System.out.println("Enter a valid response!");
                logger.userLogger("Invalid response entered by user { "+ userInputted +" }");
                start();
            }
            userControl(userInput);
        }catch (NumberFormatException e){
            System.out.println("Enter a valid response!");
            logger.errorLogger("String parsing error, user entered:  { "+ userInputted +" }", e);
            start();
        }
    }


    private void userControl(int userInput){
        Options pickedOption = listOption();
        int arraySize = arraySizePicker();
        switch (userInput){
            case 1:
                sorterControl.bubbleSort(pickedOption.value, arraySize);
                break;
            case 2:
                //quick sort

                break;
            case 3:
                //binary sort
                break;
            case 4:
                //all the methods
                break;
            default:
                System.out.println("Invalid option picked!");
                start();
        }
        start();
    }


    //List of options picking
    private Options listOption(){
        System.out.println("Please select an option \n1: Arrays \n2: Array Lists \n3: Both \nM: Go Back to Main Menu");
        try {
            userInputted = sc.next();
            if (userInputted == null || userInputted.isEmpty()){
                System.out.println("Please enter a value!");
                listOption();
            }
            if (userInputted.equals("M") || userInputted.equals("m")) {start();}
            userInput = Integer.parseInt(userInputted);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid option");
            logger.errorLogger("Parsing Error occured at listOption ",e);
            listOption();
        }
        switch (userInput){
            case 1:
                return Options.ARRAY;
            case 2:
                return Options.ARRAYLIST;
            case 3:
                return Options.BOTH;
            case 4:
                start();
            default:
                System.out.println("Invalid Input");
                logger.userLogger("User inputted incorrect value");
                listOption();
        }
        return null;
    }


    //arraysize picker
    private int arraySizePicker(){
        System.out.println("Enter the size of array to be sorted!");
        int arraySize = 0;

        if (sc.hasNext()){
            arraySize = sc.nextInt();
        }else
        {
            System.out.println("Enter a valid input!");
            logger.userLogger("User entered wrong input!");
            arraySizePicker();
        }
        return arraySize;
    }



  /*  private T[] genArray(){
        return T[];
    }*/


}
