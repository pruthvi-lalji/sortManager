package com.spartaglobal.sort.model;

public class BinaryTreeAlgo {

    class Node{
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    public BinaryTreeAlgo() {
        root = null;
    }

    void insert(int key){
        root = insertRec(root, key);
    }


    Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

       if (key < root.key){
           root.left =  insertRec(root.left, key);
       }else if(key > root.key){
           root.right = insertRec(root.right,key);
       }
       return root;
    }

    void inOrderRec(Node root){
        if (root != null){
            inOrderRec(root.left);
            System.out.println(root.key + " ");
            inOrderRec(root.right);
        }
    }

    void treeIns(int arr[]){
        for (int i =0; i<arr.length; i++){
            insert(arr[i]);
        }
    }


    public static void main(String[] args) {
        BinaryTreeAlgo binaryTree = new BinaryTreeAlgo();
        int arr[] = {5,4,9,7,2,7,5,8,4,7,58,6};
        binaryTree.treeIns(arr);
        binaryTree.inOrderRec(binaryTree.root);
    }

}



