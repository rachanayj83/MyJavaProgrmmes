package com.yjr;

public class LinkedListStack {

    private class Node {
        int data;
        Node next;
    }

    Node top;

    LinkedListStack() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();

        if (temp == null) {
            System.out.println("Stack overflow");
            return;
        }

        temp.data = x;
        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void display() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            System.exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println("Elements of Stack: ");
                System.out.println(temp.data);
                temp = temp.next;

            }
        }

    }

    public int length() {
        int length = 0;
        Node current = top; // Starts counting from head - first node
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

}
