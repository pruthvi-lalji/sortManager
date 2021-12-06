package com.spartaglobal.sort.com.spartaglobal;

import com.spartaglobal.sort.model.BST;
import com.spartaglobal.sort.model.GenericBinaryTree;


import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        //GenericSorter2 gen = new BubbleSort();
        Integer[] array = {1,4,7,2,7,2,7,0,6,7,1,85,7,2,6};
        //System.out.println(Arrays.toString(gen.sortArray(array)));

        GenericSorter2 gen2 = new GenericBinaryTree2();
        System.out.println(Arrays.toString(gen2.sortArray(array)));


        GenericBinaryTree gen4 = new GenericBinaryTree<>();
        //System.out.println(Arrays.toString(gen4.binaryRun(array)));

        BST bst = new BST();
        bst.run(array);

    }
}
