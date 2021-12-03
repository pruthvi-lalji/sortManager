package com.spartaglobal.sort.view;

import com.spartaglobal.sort.model.RandomArrayGenerator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    private static Object Double;

    public static void main(String[] args) {

        RandomArrayGenerator2 rd = new RandomArrayGenerator2(Double.class);
        System.out.println(Arrays.toString(rd.randArray( 10)));
        List<Double> doubleList = new ArrayList<>();
        doubleList = rd.randArrayList(10);
        System.out.println(doubleList);


















    /*

        GenericSorter gs = new GenericBubbleSort();
        GenericSorter quickSort = new GenericQuickSort();
        RandomArrayGenerator rd = new RandomArrayGenerator();
        Double[] array = {2.1,5.4,7.0,9.7,10.5,1.0,0.4,66.4,7.4,5.4};
        String[] array2 = {"bals", "jack", "blus","plain","sain","apple"};
       // System.out.println(Arrays.toString(gs.sortArray(array)));
        //System.out.println(Arrays.toString(gs.sortArray(array2)));

        List<Double> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(5.4);
        myList.add(8.4);
        myList.add(5.2);
        myList.add(6.4);
        myList.add(7.5);
        myList.add(18.4);
        myList.add(9.4);
        myList.add(6.4);
        myList.add(0.5);
        myList.add(1.2);
        System.out.println(myList);
        //System.out.println(gs.sortList(myList));
        //System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(quickSort.sortArray(array)));
        System.out.println(quickSort.sortList(myList));
        List<Character> charList = new ArrayList<>();
        charList.add('b');
        charList.add('p');
        charList.add('a');
        charList.add('g');
        charList.add('u');
        charList.add('n');
        charList.add('l');
        charList.add('q');
        charList.add('w');
        charList.add('c');
        System.out.println(charList);
       // System.out.println(gs.sortList(charList));
        System.out.println(quickSort.sortList(charList));

*/
    }
}
