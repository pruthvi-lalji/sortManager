package com.spartaglobal.sort.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserController {
    private Scanner sc = new Scanner(System.in);
    private String userInputed;
    private int userInput;
    private final SortController sortControl = new SortController();
    private Class arrayType;
    private LogGenerator logger = new LogGenerator(UserController.class);
    private Options type;

    private enum Options {ARRAY(1), ARRAYLIST(2), BOTH(3), MENU_MENU(4);
        private int value;
        Options(int value){this.value = value;}
    };

    public void userControl(){
        boolean iterOn = true;
        while(iterOn){
            System.out.println("---------------------- Sort Manager----------------------\n1: Bubble Sort \n2: Quick Sort \n3: All Sorting Method \nX: Exit");
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
                logger.errorLogger("Invalid Input @Main Menu: ", e); //Logger
                continue;
            }
            boolean userPicked = false;
            do{
            try {
                System.out.println("Chose Datatype to use: ");
                System.out.println("1: Integer \n2: Double \n3: Char");
                String user = sc.next();
                if (user.equals("1") || user.equals("1")){
                    arrayType = Integer.class;
                    userPicked = true;
                }
                else if (user.equals("2") || user.equals("2")){
                    arrayType = Double.class;
                    userPicked = true;
                }
                else {
                    arrayType = Character.class;
                    userPicked = true;
                }
            } catch (Exception e){
                System.out.println("Please Pick one!");
                logger.errorLogger("Empty/Invalid Input @DataType Menu: ", e);

            }
            }while(!userPicked);


            switch (userInput){
                case 1:
                    //Type of array
                    type = optionsSelection();
                    int option = type.value;
                    //Size of array
                    int size = arraySize();
                    logger.userLogger("Algorithm: Bubble Sort, Container:" + type + " Datatype: " + arrayType.getSimpleName());
                    sortControl.bubbleSort(option,"Integer",size/*,arrayType*/ );
                    break;
                case 2:
                    //quick sort
                     type = optionsSelection();
                     option = type.value;
                     size = arraySize();
                    logger.userLogger("Algorithm: Quick Sort, Container:" + type + " Datatype: " + arrayType.getSimpleName());
                    sortControl.quickSort(option, "Integer", size);
                    break;
                case 3:
                    type = optionsSelection();
                    option = type.value;
                    size = arraySize();
                    logger.userLogger("Algorithm: Bubble Sort & Quick Sort, Container:" + type + " Datatype: " + arrayType.getSimpleName());
                    sortControl.bubbleSort(option,"Integer", size/*, arrayType*/);
                    sortControl.quickSort(option, "Integer",size);
                    break;
                default:
                    // Invalid option
                    System.out.println("Invalid");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }


    private Options optionsSelection(){
        System.out.println("Please select a option");
        System.out.println("1: Arrays");
        System.out.println("2: Array List");
        System.out.println("3: Both");
        System.out.println("M: Go Back To Main Menu");
        try{
            userInputed = sc.next();
            if (userInputed.equals("M") ||  userInputed.equals("m")){
                userControl();
            }
            userInput = Integer.parseInt(userInputed);
        } catch (NumberFormatException e){
            System.out.println("Enter A Valid Input!");
            logger.errorLogger("Container Type invalid option picked: ", e);
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

    private int arraySize(){
        System.out.println("What array size would you like? ");
        try{
            userInput = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Enter a valid value!");
            logger.errorLogger("Invalid array size picked:", e);
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
