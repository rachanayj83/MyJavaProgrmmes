package com.yjr;

public class BinaryTree {
    Node root;

    private class Node{
        Node left,right;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    // Function to insert nodes in the tree
    public Node createTree(int[] data, Node root, int i) {
        if (i < data.length){
            Node temp = new Node(data[i]);
            root = temp;
            root.left = createTree(data, root.left, 2*i+1);
            root.right = createTree(data, root.right, 2*i+2);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

}
