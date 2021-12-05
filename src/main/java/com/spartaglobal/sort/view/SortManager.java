package com.spartaglobal.sort.view;

import com.spartaglobal.sort.controller.UserControll;
import com.spartaglobal.sort.model.RandomGenerator;

import java.util.Arrays;


public class SortManager {
    public static void main(String[] args) {
/*

        RandomGenerator<Integer> list = new RandomGenerator<>();
        list.RandomList(random -> random.nextInt(100),100);
        System.out.println(list.getList());


        RandomGenerator<Double> list2 = new RandomGenerator<>();
        list2.RandomList(rand -> (rand.nextDouble(100)),10);
        System.out.println(list2.getList());


        RandomGenerator<Character> list3 = new RandomGenerator<>();
        list3.RandomList(rand -> (char)(rand.nextInt(26)+'a'),10);
        System.out.println(list3.getList());



        RandomGenerator<Integer> list4 = new RandomGenerator<>();
        list4.RandomArray(rand -> (rand.nextInt(1000)),10);
        System.out.println(Arrays.toString(list4.getArray()));

        RandomGenerator<Double> list5 = new RandomGenerator<>();
        list5.RandomArray(rand -> (rand.nextDouble(1000)),10);
        System.out.println(Arrays.toString(list5.getArray()));

        RandomGenerator<Character> list6 = new RandomGenerator<>();
        list6.RandomArray(rand -> (char)(rand.nextInt(26)+'a'),10);
        System.out.println(Arrays.toString(list6.getArray()));
*/


        UserControll userControll = new UserControll();
        userControll.start();
    }
}
