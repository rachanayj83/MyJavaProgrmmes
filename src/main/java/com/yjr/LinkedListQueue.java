package com.yjr;

public class LinkedListQueue {
    Node front;
    Node rear;

    LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void displayData() {
            System.out.println(" data = " + data);
        }
    }

    public void insertLast(int i) {
        Node newNode = new Node(i);
        if (isEmpty()) {
            front = newNode;
        } else {
            // previous last point to new node
            rear.next = newNode;
        }
        rear = newNode;
    }


    public int removeFirst() {

        int temp = front.data;
        // If no node left after deleting node
        if (front.next == null) {
            rear = null;
        }
        // front starts pointing to next element
        front = front.next;
        return temp;
    }

    public int peek() {
        // check for an empty queue
        if (front != null) {
            return front.data;
        } else {
            System.exit(1);
        }

        return -1;
    }

    // Method to traverse and display all nodes
    public void displayList() {
        // Start from first node
        Node current = front;
        // loop till last node
        while (current != null) {
            current.displayData();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public int size(){
        Node current = front;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }


}
