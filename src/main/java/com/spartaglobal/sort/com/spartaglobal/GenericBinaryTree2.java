package com.spartaglobal.sort.com.spartaglobal;

import com.spartaglobal.sort.controller.GenericSorter;

import java.util.ArrayList;
import java.util.List;

public class GenericBinaryTree2<T> implements GenericSorter2 {
    List<Comparable> list = new ArrayList<>();

    @Override
    public Comparable[] sortArray(Comparable[] array) {
        for (int i = 0; i<array.length;i++){
            insert(array[i]);
        }
        inOrder();
        Comparable[] sortArray = new Comparable[list.size()];
        for (int i = 0; i < list.size();i++){
            sortArray[i] = list.get(i);
        }

        return sortArray;
    }

    @Override
    public List sortList(List arrayList) {
        return null;
    }


    class Node<T>{
        private Comparable data;
        private Node<T> left, right;

        public Node(Comparable data){this.data = data;}
    }

    private Node<T> root;


    private void insert(Comparable data){
        root = insert(root,data);
    }



    private  Node<T> insert(Node<T> root, Comparable data){
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



}
