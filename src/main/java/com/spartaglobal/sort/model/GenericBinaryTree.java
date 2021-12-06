package com.spartaglobal.sort.model;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.ArrayList;
import java.util.List;

public class GenericBinaryTree<T extends Comparable<? super T>> implements GenericSorter {

    List<T> list = new ArrayList<>();
    public T[] binaryRun(T[] array){
        for (int i = 0; i<array.length;i++){
            insert(array[i]);
        }
        return array;
    }




    @Override
    public <T extends Comparable> T[] sortArray(T[] array) {
        return null;
    }


    class Node<T>{
        private T data;
        private Node<T> left, right;

        public Node(T data){this.data = data;}
    }

    private Node<T> root;


    private void insert(T data){
        root = insert(root,data);
    }



    private  Node<T> insert(Node<T> root, T data){
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
        list.add(root.data);
        inOrder(root.right); //check all the right root/nodes

    }




    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        return null;
    }
}
