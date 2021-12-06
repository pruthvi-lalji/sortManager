package com.spartaglobal.sort.model;

import java.util.ArrayList;
import java.util.List;

public class TreeSort<T extends Comparable<? super T>> {
    private long sortTime;
    private Node root;
    class Node{
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(T data){
        root = insert(root,data);
    }

    private Node insert(Node root, T data){
        if (root == null){
            return new Node(data);
        }
        if (data.compareTo(root.data) < 0){
            root.left = insert(root.left,data);
        }
        if (data.compareTo(root.data) > 0){
            root.right = insert(root.right, data);
        }
        return root;
    }





    public void inOrder(Node root, List<T> sorted){
        if (root == null){
            return;
        }
        inOrder(root.left, sorted);
        sorted.add(root.data);
        inOrder(root.right,sorted);
    }


    public List<T> sort(T[] array){
        if (array == null || array.length == 0){
            return null;
        }
        for (int i =0; i< array.length;i++){
            insert(array[i]);
        }
        List<T> sorted = new ArrayList<>();
        inOrder(root, sorted);
        return sorted;
    }


    public List<T> sort(List<T> array){
        if (array == null || array.isEmpty()){
            return null;
        }
        long startTime = System.nanoTime();
        for (int i =0; i< array.size();i++){
            insert(array.get(i));
        }
        List<T> sorted = new ArrayList<>();
        inOrder(root, sorted);
        long endTime = System.nanoTime();
        sortTime = endTime - startTime;
        return sorted;
    }

    public long sortTime(){
        return sortTime;
    }


}
