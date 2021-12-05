package com.spartaglobal.sort.model;

import java.util.ArrayList;

class Node<T>{
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
    }
}


public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    //Inserting data
    public void insert(T data){
        root = insert(root,data);
    }

    private Node<T> insert(Node<T> root, T data){
        if (root == null){
            return new Node<T>(data);
        }
        else if (data.compareTo(root.data) < 0){
            root.left = insert(root.left, data);
        }
        else if (data.compareTo(root.data) > 0){
            root.right = insert(root.right,data);
        }
        return root;
    }



    //Printing - ordered array
    public void inOrder(){

        System.out.println("Sorted:");
        inOrder(root);
    }


    private void inOrder(Node<T> root){
        if (root == null){
            return;
        }
        //check all the left roots/nodes first
        inOrder(root.left);
        System.out.println(" " + root.data); //add to the list
        inOrder(root.right); //check all the right root/nodes

    }


    //array input
    public void insertionLoop(T[] array){
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++){
            insert(array[i]);
        }
        inOrder();
    }


    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>();
        RandomArrayGenerator2 rd2 = new RandomArrayGenerator2(Integer.class);
        Integer[] array1;
        array1 = (Integer[]) rd2.randArray(100);
        binaryTree1.insertionLoop(array1);


    }


}
