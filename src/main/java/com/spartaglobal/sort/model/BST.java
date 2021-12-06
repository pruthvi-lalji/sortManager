package com.spartaglobal.sort.model;

import java.util.ArrayList;
import java.util.List;

public class BST <T extends Comparable<? super T>> {

    List<T> list = new ArrayList();
    public T[] run(T[] array){
        if (array == null || array.length == 0){
            return null;
        }
        for (int i = 0; i<array.length;i++){
            insert(array[i]);
        }
        inOrder();
        Object[] sortArray = new Object [list.size()];
        for (int i =0; i< list.size(); i++){
            sortArray[i] = list.get(i);
        }
        return (T[]) sortArray;

    }


    class BinaryNode<T>{
        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;

        public BinaryNode(T element) {
            this.element = element;
        }
    }
    BinaryNode<T> root;

    public void insert(T x){
        root = insert(x, root);
    }

    private BinaryNode<T> insert(T x, BinaryNode<T> sRoot){
        if (sRoot == null){
            return new BinaryNode<T>(x);
        }
        int compareResult = x.compareTo(sRoot.element);

        if (compareResult < 0){
            sRoot.left = insert(x, sRoot.left);
        }
        else if (compareResult > 0){
            sRoot.right = insert(x, sRoot.right);
        }
        else{
            //dupe
        }
        return sRoot;
    }


    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(BinaryNode<T> root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.element);
        inOrder(root.right);
    }





    public List<T> run(List<T> array){
        if (array == null || array.isEmpty()){
            return null;
        }
        for (int i = 0; i<array.size();i++){
            insert(array.get(i));
        }
        inOrder();
        Object[] sortArray = new Object [list.size()];
        for (int i =0; i< list.size(); i++){
            sortArray[i] = list.get(i);
        }
        return list;

    }







}
