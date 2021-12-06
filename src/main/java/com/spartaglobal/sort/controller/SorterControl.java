package com.spartaglobal.sort.controller;

import com.spartaglobal.sort.model.GenericBinaryTree;
import com.spartaglobal.sort.view.ArrayPrinter;
import com.spartaglobal.sort.model.GenericBubbleSort;
import com.spartaglobal.sort.model.GenericQuickSort;
import com.spartaglobal.sort.model.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class SorterControl<T> {
    class DurationTime {
        private long startTime;
        private long endTime;
        private long duration;

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public long getDuration() {
            return endTime-startTime;
        }


    }

    RandomGenerator<Integer> randomGen = new RandomGenerator<>();
    DurationTime durationTime = new DurationTime();
    GenericSorter bubbleSort = new GenericBubbleSort();
    GenericSorter quickSort = new GenericQuickSort();
    GenericSorter binaryTree = new GenericBinaryTree<>();
    ArrayPrinter arrayPrinter = new ArrayPrinter();



    List<T> unsorted;

    public <T extends Comparable>void bubbleSort(int arrayType, int arraySize){
           //randomGen.randomArray(random -> random.nextInt(1000),  arraySize);
            randomGen.randomList(random -> random.nextInt(1000), arraySize);
        if (arrayType == 1){
            //Need to change to array currently using arrayList;
            bubbleSort(randomGen.getList());
        }
        else if (arrayType == 2){

            bubbleSort(randomGen.getList());
        }
        else{
            //bubbleSort(randomGen.getArray());
            bubbleSort(randomGen.getList());
        }
    }



    private  <T extends Comparable> void bubbleSort(T[] array){
        //Implement Methods
    }


    //arry size, type of option
    private  <T extends Comparable> void bubbleSort(List<T> array){
        durationTime.setStartTime(System.nanoTime());
        copyArrayList(array);
        List<T> sortedList  = bubbleSort.sortList(array);
        durationTime.setEndTime(System.nanoTime());
        arrayPrinter.displayArrayList(unsorted, sortedList,durationTime.getDuration());
    }




    public <T extends Comparable> void quickSort(int arrayType, int arraySize){
        randomGen.randomList(random -> random.nextInt(1000), arraySize);
        //randomGen.randomArray(random -> random.nextInt(1000),  arraySize);
        if (arrayType == 1){
            //Need to change this to array
           quickSort(randomGen.getList());

        }
        else if (arrayType == 2){
            quickSort(randomGen.getList());


        }
        else{
            //both      quickSort(randomGen.getArray());
            quickSort(randomGen.getList());

        }
    }

    private <T extends Comparable> void quickSort(T[] array){}

    private <T extends Comparable> void quickSort(List<T> array){
        durationTime.setStartTime(System.nanoTime());
        List<T> sortedList = quickSort.sortList(array);
        durationTime.setEndTime(System.nanoTime());
        //send to print method
        arrayPrinter.displayArrayList(array, sortedList,durationTime.getDuration());
    }



    public <T extends Comparable> void binarySort(int arrayType, int arraySize){
        randomGen.randomList(random -> random.nextInt(1000), arraySize);
        //randomGen.randomArray(random -> random.nextInt(1000),  arraySize);
        if (arrayType == 1){
            //Need to change this to array
            binarySort(randomGen.getList());

        }
        else if (arrayType == 2){
            binarySort(randomGen.getList());


        }
        else{
            //both      quickSort(randomGen.getArray());
            binarySort(randomGen.getList());

        }
    }

    private <T extends Comparable> void binarySort(T[] array){


    }
    private <T extends Comparable> void binarySort(List<T> array){
        durationTime.setStartTime(System.nanoTime());

        durationTime.setEndTime(System.nanoTime());
        durationTime.getDuration();
    }



    //Copying arrays;
    private <T extends Comparable> List<T> copyArrayList(List<T> arrayList){
        unsorted = new ArrayList(arrayList);
        return (List<T>) unsorted;
    }








}
