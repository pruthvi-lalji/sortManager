package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> implements GenericSorter {

  private List<T> arrayList = new ArrayList<>();
  private T[] array;



    @Override
    public <T extends Comparable> T[] sortArray(T[] array) {
        if (array == null){
            return null;
        }
        else
        {
            //insertionLoop(array);

        }
        return array;
    }

    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()){
            return null;
        }
        else
        {
            //loop
        }
        return arrayList;
    }

    class Node<T>{
        private T data;
        private Node<T> left, right;

        public Node(T data) {
            this.data = data;
        }
    }


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
        arrayList.add(root.data);
        inOrder(root.right); //check all the right root/nodes

    }

    //array input
    public List<T> insertionLoop(T[] array){
        if (array == null){
            return null;
        }
        for (int i = 0; i < array.length; i++){
            insert(array[i]);
        }
        inOrder();
        return this.arrayList;
    }


}
