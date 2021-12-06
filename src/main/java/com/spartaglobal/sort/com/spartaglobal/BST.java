package com.spartaglobal.sort.com.spartaglobal;

public class BST <T extends Comparable<? super T>> {


    public void run(T[] array){
        for (int i = 0; i<array.length;i++){
            insert(array[i]);
        }
        inOrder();

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
        System.out.println(" " + root.element);
        inOrder(root.right);
    }




}
